package com.example.springappall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;
import java.net.Authenticator;

@Service
public class SercurityServiceImpl {
    @Autowired
    private AuthenticationManager authenticationManager;

}
