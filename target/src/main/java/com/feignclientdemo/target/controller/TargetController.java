package com.feignclientdemo.target.controller;

import com.feignclientdemo.target.service.TargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/target")
public class TargetController {

    @Autowired
    private TargetService targetService;

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        return targetService.getHello();
    }

}
