package com.example.reviewapi.controller;

import com.example.reviewapi.service.ReviewService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("events")
public class EventController {

    private final ReviewService service;

    public EventController(ReviewService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> createReview() {
        return ResponseEntity.ok().body(null);
    }
}
