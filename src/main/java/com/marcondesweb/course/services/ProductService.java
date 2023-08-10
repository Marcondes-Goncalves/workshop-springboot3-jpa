package com.marcondesweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcondesweb.course.entities.Product;
import com.marcondesweb.course.repositories.ProductRepository;


@Service
public class ProductService {
    
    @Autowired //injeção automática de dependências
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }





}
