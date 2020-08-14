package com.leolee.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${hello}")
    private String hello;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getConfigHello() {
        return hello;
    }

}