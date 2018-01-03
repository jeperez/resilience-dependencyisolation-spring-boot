package com.example.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.remote.ExampleRemote;

/**
 */
@Component
public class ExampleRemoteHystrix implements ExampleRemote{

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " +name+", this is the fallback from hystrix stream.";
    }
}
