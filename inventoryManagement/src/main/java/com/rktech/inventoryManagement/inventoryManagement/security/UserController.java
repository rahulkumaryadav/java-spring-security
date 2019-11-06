package com.rktech.inventoryManagement.inventoryManagement.security;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/rk" })
public class UserController {
 
	@GetMapping(produces = "application/json")
	@RequestMapping({"/loginCheck"})
	public ResponseEntity<User> validateLogin() {
		
		Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
		System.out.println("user **********"+authentication.getPrincipal());

    	//User user=(User) authentication.getPrincipal();
		
		return new ResponseEntity<>(new User(null, null, null, null, null, "User login sucessfully", null),HttpStatus.OK);
	}
	
	

}
