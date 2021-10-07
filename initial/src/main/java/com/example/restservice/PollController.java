package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/poll")
    public Poll poll(@RequestParam(value = "answer1", defaultValue = "foo") String answer1,
                     @RequestParam(value = "answer2", defaultValue = "bar") String answer2,
                     @RequestParam(value = "question", defaultValue = "No Question") String question,
                     @RequestParam(value = "superUser", defaultValue = "-1") String superUser) {
        return new Poll(counter.incrementAndGet(), answer1, answer2, question, Long.parseLong(superUser));
    }
}