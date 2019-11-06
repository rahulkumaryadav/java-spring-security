package com.rktech.inventoryManagement.inventoryManagement.controller;


import com.rktech.inventoryManagement.inventoryManagement.entity.Home;
import com.rktech.inventoryManagement.inventoryManagement.repository.HomeRepository;
import com.rktech.inventoryManagement.inventoryManagement.security.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HelloController {

    @Autowired
    HomeRepository homeRepository;
    
    @PostMapping("/save")
    public void save(@RequestBody Home home) {
    	homeRepository.save(home);
    	
    }

    @GetMapping
    public  User hello(){
    	Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
    	User user=(User) authentication.getPrincipal();
        List<Home> homeList= (List<Home>) homeRepository.findAll();
        System.out.println("***********"+homeList);

        return user;
    }
}
