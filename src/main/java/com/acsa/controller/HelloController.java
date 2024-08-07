package com.acsa.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Operation(summary = "Access Protected Resource with JWT", description = "Protected Resource")
    @SecurityRequirement(name = "Bearer Authentication")
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
