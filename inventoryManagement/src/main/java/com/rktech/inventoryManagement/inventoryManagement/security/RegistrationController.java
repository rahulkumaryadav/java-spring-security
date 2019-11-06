package com.rktech.inventoryManagement.inventoryManagement.security;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegistrationController {

    private UserRepository userRepository;
   // private PasswordEncoder passwordEncoder;

    public RegistrationController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String registrationForm(){

        return "registration";
    }

    @PostMapping("/hi")
    public String processRegistration(){
        return "redirect:/login";
    }


}
