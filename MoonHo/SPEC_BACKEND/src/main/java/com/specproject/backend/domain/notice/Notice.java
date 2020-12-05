package com.specproject.backend.domain.notice;

import com.specproject.backend.domain.activities.Activities;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@Entity
@NoArgsConstructor
public class Notice {
    @Id // Primary KEY 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NOTICE_ID")
    private Long notice_ID;

    @Column(name = "CATEGORY", nullable = false)
    private String category;

    @Column(name = "CREATE_DATE", columnDefinition = "DATE", nullable = false)
    private Date create_date;

    @Column(name = "CONTENTS", columnDefinition = "LONGTEXT")
    private String content;

    @Builder
    private Notice(Long notice_ID, String category, Date create_date, String content) {
        this.notice_ID = notice_ID;
        this.category = category;
        this.create_date = create_date;
        this.content = content;
    }

}
