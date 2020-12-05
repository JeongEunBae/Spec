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
    @Column(name = "ACT_APPLY_ID")
    private Long actApplyID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACT_ID") // Foreign KEY 지정
    private Activities actID;

    @Column(name = "USER_ID", length = 100, nullable = false) // 데이터 사이즈 조정, null 여부 설정
    private String userID;

    @Column(name = "USER_NAME", length = 40, nullable = false)
    private String userName;

    @Column(name = "EMAIL", length = 500, nullable = false)
    private String email;

    @Column(name = "FILE", columnDefinition = "LONGTEXT") // 데이터 형식 변경
    private String file;


    @Builder
    private ActApply(Long actApplyID, Activities actID, String userID, String userName, String email, String file) {
        this.actApplyID = actApplyID;
        this.actID = actID;
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.file = file;
    }

}
