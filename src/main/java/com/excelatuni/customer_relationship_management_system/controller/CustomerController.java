package com.excelatuni.customer_relationship_management_system.controller;

import com.excelatuni.customer_relationship_management_system.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "http://localhost:4200")
@ComponentScan(value = "com.excelatuni.customer_relationship_management_system")
@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;




}
