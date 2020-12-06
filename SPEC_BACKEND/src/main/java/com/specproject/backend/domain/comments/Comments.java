package com.specproject.backend.domain.comments;

import com.specproject.backend.domain.BaseEntity;
import com.specproject.backend.domain.activities.Activities;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
@Component
public class Comments extends BaseEntity {
    @Id // Primary KEY 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comment_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "act_id", nullable = false) // Foreign KEY 지정
    private Activities activities;

    @Column(length = 100, nullable = false) // 데이터 사이즈 조정, null 여부 설정
    private String userID;

    @Column(columnDefinition = "TEXT") // 데이터 형식 변경
    private String contents;

    @Builder
    private Comments(Activities activities, String userID, String contents){
        this.activities = activities;
        this.userID = userID;
        this.contents = contents;
    }
}