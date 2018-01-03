package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.remote.ExampleRemote;

@RestController
public class ConsumerController {

    @Autowired
    ExampleRemote remote;
	
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return remote.hello2(name);
    }

}