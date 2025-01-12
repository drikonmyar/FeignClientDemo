package com.feignclientdemo.source.service;

import org.springframework.stereotype.Service;

@Service
public class SourceService {

    public String sayHelloFromSource(){
        return "Hello From Source";
    }

}
