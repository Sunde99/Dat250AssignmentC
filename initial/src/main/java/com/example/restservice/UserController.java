package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class UserController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/user")
    public User2 user2(@RequestParam(value = "name", defaultValue = "Bob") String name) {
        return new User2(counter.incrementAndGet(), name);
    }
}
