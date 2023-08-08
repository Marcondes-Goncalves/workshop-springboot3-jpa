package com.marcondesweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcondesweb.course.entities.Order;
import com.marcondesweb.course.repositories.OrderRepository;


@Service
public class OrderService {
    
    @Autowired //injeção automática de dependências
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }





}
