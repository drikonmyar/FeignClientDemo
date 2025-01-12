package com.feignclientdemo.target.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "source-service", url = "http://localhost:8081/source")
public interface SourceApiClient {

    @GetMapping("/hello")
    ResponseEntity<String> sayHello();

}
