package com.relesi.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @RequestMapping(value = "/auth", method = RequestMethod.GET)
    public String auth() {
        return "auth";
    }
}
