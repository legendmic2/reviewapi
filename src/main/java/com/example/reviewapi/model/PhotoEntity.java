package com.example.reviewapi.model;

import lombok.*;

import javax.persistence.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Photo")
public class PhotoEntity {
    @ManyToOne
    @JoinColumn(name = "reviewId")
    @ToString.Exclude
    private ReviewEntity review;
    @Id
    private String photoId;
}
