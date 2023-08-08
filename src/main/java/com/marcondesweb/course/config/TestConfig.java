package com.marcondesweb.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.marcondesweb.course.entities.Order;
import com.marcondesweb.course.entities.User;
import com.marcondesweb.course.repositories.OrderRepository;
import com.marcondesweb.course.repositories.UserRepository;

@Configuration
@Profile("test") // o spring só ira rodar essa configuraçãop quando estivermos no perfil de tste
public class TestConfig implements CommandLineRunner {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override // tudo que estiver dentro desse método será iniciado quando a aplicação for iniciada
    public void run(String... args) throws Exception {
        
        // tive que fazer o cast para o tipo de dado associado ao ID
        User u1 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1); 
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2); 
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }




}
