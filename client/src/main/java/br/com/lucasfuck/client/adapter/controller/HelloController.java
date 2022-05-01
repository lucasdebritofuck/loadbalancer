package br.com.lucasfuck.client.adapter.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private final Environment environment;

    public HelloController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping
    public String hello() {
        return "Hello, I am running on port: " + environment.getProperty("local.server.port");
    }

}
