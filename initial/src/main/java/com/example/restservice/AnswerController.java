package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/answer")
    public Answer answer(@RequestParam(value = "vote", defaultValue = "true") String vote,
                         @RequestParam(value = "pollId", defaultValue = "-1") String pollId,
                         @RequestParam(value = "user2_id", defaultValue = "-1") String user2_id) {
        return new Answer(counter.incrementAndGet(), Boolean.valueOf(vote), Long.parseLong(pollId), Long.parseLong(user2_id));
    }
}