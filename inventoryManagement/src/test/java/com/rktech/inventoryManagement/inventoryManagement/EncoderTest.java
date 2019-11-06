package com.rktech.inventoryManagement.inventoryManagement;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class EncoderTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EncoderTest.class);
   
    @Test
    public void bcryptEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encoded = bCryptPasswordEncoder.encode("test_pass");
        LOGGER.info("Becrypt encoded "+encoded);
    }
    @Test
    public void standardEncoder() {
        StandardPasswordEncoder standardPasswordEncoder = new StandardPasswordEncoder();
        String encoded = standardPasswordEncoder.encode("test_pass");
        LOGGER.info("Standard encoded "+encoded);
    }
}



