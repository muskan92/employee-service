package com.ola.practice.employeeservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

    @RequestMapping(path = "/getmsg", method = RequestMethod.GET)
    public ResponseEntity<String> getMessage(){
        return new ResponseEntity<>("helloworld", HttpStatus.OK);
    }

}
