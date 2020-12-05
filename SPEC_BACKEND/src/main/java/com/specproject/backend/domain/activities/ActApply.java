package com.specproject.backend.domain.activities;

import com.specproject.backend.domain.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class ActApply extends BaseEntity {
    @Id // Primary KEY 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long act_apply_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "act_id") // Foreign KEY 지정
    private Activities activities;

    @Column(length = 100, nullable = false) // 데이터 사이즈 조정, null 여부 설정
    private String userID;

    @Column(nullable = false)
    private String email;

    @Column(columnDefinition = "LONGTEXT") // 데이터 형식 변경
    private String file;


    @Builder
    private ActApply(Activities activities, String userID, String email, String file) {
        this.activities = activities;
        this.userID = userID;
        this.email = email;
        this.file = file;
    }

}
