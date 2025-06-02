package com.task.project.taskproject.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRest {

    @GetMapping
    public ResponseEntity<String> testFirstEndpoint() {
        return ResponseEntity.ok("success");
    }
}
