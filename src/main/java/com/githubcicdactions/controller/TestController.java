package com.githubcicdactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/test")
public class TestController {

    @GetMapping
    public String test() {
        return "Learning Github CI/CD Actions.";
    }

}
