package com.example.reviewapi.service;

import com.example.reviewapi.model.ReviewEntity;
import com.example.reviewapi.persistence.ReviewRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ReviewServiceImpl implements ReviewService{
    private final ReviewRepository repository;

    public ReviewServiceImpl(ReviewRepository repository) {
        this.repository = repository;
    }

    public List<ReviewEntity> create(final ReviewEntity entity) {
        log.info("create");
        return new ArrayList<>();
    }
}
