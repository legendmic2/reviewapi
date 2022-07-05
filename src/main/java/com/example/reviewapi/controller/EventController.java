package com.example.reviewapi.controller;

import com.example.reviewapi.dto.ReviewDTO;
import com.example.reviewapi.dto.UserDTO;
import com.example.reviewapi.service.ReviewService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        List<UserDTO> userList = new ArrayList<>();
        userList.add(new UserDTO());
        ResponseDTO<Object> response = ResponseDTO.builder().data(Collections.singletonList(userList)).build();

        return ResponseEntity.ok().body(response);
    }
}
