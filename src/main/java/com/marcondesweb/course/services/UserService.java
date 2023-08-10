package com.marcondesweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcondesweb.course.entities.User;
import com.marcondesweb.course.repositories.UserRepository;


@Service
public class UserService {
    
    @Autowired //injeção automática de dependências
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    //inserindo um objeto no banco de dados
    public User insert(User obj) {
        return repository.save(obj);
    }



}
