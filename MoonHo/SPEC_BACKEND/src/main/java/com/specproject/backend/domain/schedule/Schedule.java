package com.specproject.backend.domain.schedule;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Schedule {
    @Id // Primary KEY 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SCHEDULE_ID")
    private Long schedule_ID;

    @Column(name = "TITLE", nullable = false) // 데이터 사이즈 조정, null 여부 설정
    private String title;

    @Column(name = "START_DATE", columnDefinition = "DATETIME", nullable = false)
    private String start_date;

    @Column(name = "END_DATE", columnDefinition = "DATETIME")
    private String end_date;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "MEMO", columnDefinition = "LONGTEXT") // 데이터 형식 변경
    private String memo;


    @Builder
    private Schedule(Long schedule_ID, String title, String start_date, String end_date, String category, String memo) {
        this.schedule_ID = schedule_ID;
        this.title = title;
        this.start_date = start_date;
        this.end_date = end_date;
        this.category = category;
        this.memo = memo;
    }
}
