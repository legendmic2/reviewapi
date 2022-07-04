package com.example.reviewapi.service;

import com.example.reviewapi.model.ReviewEntity;

import java.util.List;

public interface ReviewService {
    public List<ReviewEntity> create(final ReviewEntity entity);
}
