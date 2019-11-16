package com.reethika.practice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import javax.ws.rs.core.MediaType;

@RequestMapping("/api")
@RestController
public class TestRestController
{
    @RequestMapping(method = RequestMethod.GET, value = "getDetails", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<Object> validateEnrollCustomer()
    {
        return new ResponseEntity<Object>("yesssss", HttpStatus.OK);
    }
}
