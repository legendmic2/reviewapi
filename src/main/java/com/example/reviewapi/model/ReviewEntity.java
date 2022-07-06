package com.example.reviewapi.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Review")
public class ReviewEntity {
    private String type;
    private String action;
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String reviewId;
    private String content;

//    @ManyToOne
//    @JoinColumn(name = "userId")
//    @ToString.Exclude
//    private UserEntity user;
//    private String placeId;

    @OneToMany
    @JoinColumn(name = "reviewId")
    private Set<PhotoEntity> attachedPhotos;
    // entity mapping
//    @OneToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "")
}
