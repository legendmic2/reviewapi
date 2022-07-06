package com.example.reviewapi.dto;

import com.example.reviewapi.model.ReviewEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReviewDTO {
    private String type;
    private String action;
    private String reviewId;
    private String content;
    private List<String> attachedPhotoIds;
    private String userId;
    private String placeId;

    public ReviewDTO(final ReviewEntity entity) {
        this.type = entity.getType();
        this.action = entity.getAction();
        this.reviewId = entity.getReviewId();
        this.content = entity.getContent();
        this.attachedPhotoIds = new ArrayList<>(); // Photo로 채우자
        this.userId = userId;
        this.placeId = placeId;
    }
}
