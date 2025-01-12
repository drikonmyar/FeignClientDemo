package com.feignclientdemo.target.service;

import com.feignclientdemo.target.service.client.SourceApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TargetService {

    @Autowired
    private SourceApiClient sourceApiClient;

    public ResponseEntity<String> getHello(){
        return new ResponseEntity<>("Calling from target: " + sourceApiClient.sayHello().getBody(), HttpStatus.OK);
    }

}
