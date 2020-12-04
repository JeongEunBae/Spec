package com.specproject.backend.domain.activities;

import com.specproject.backend.domain.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Activities extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Primary KEY 지정
    @Column(name = "ACT_ID")
    private Long actID;

    @Column(name = "ACT_NAME", length = 500, nullable = false)
    private String actName;

    @Column(name = "ORGANIZER_PLAN", length = 500, nullable = false)
    private String organizerPlan;

    @Column(name = "ORGANIZER_MANAGE", length = 500, nullable = false)
    private String organizerManage;

    @Column(name = "TAG", length = 500, nullable = false)
    private String tag;

    @Column(name = "START_PERIOD", columnDefinition = "DATETIME", nullable = false) // 데이터 형식 변경, null 여부 설정
    private String startPeriod;
    @Column(name = "END_PERIOD",columnDefinition = "DATETIME", nullable = false)
    private String endPeriod;

    @Column(name = "CONTENTS", columnDefinition = "TEXT", nullable = false)
    private String contents;

    @Column(name = "PRICE", columnDefinition = "INT", nullable = false)
    private int price;

    @Column(name = "POSTER",columnDefinition = "MEDIUMBLOB")
    private String poster;

    @Column(name = "FILE", columnDefinition = "LONGTEXT")
    private String file;

    @Column(name = "MANAGER", nullable = false, length = 30) // 데이터 사이즈 조정, null 여부 설정
    private String manager;

    @Column(name = "PAGE")
    private String page;

    @Column(name = "PHONE_NUMBER", nullable = false, length = 30)
    private String phone_number;

    @Builder
    private Activities(Long actID, String actName, String organizerPlan, String organizerManage,
                       String tag, String startPeriod, String endPeriod, String contents,
                       int price, String poster, String file, String manager, String page, String phone_number) {
        this.actID = actID;
        this.actName = actName;
        this.organizerPlan = organizerPlan;
        this.organizerManage = organizerManage;
        this.tag = tag;
        this.startPeriod = startPeriod;
        this.endPeriod = endPeriod;
        this.contents = contents;
        this.price = price;
        this.poster = poster;
        this.file = file;
        this.manager = manager;
        this.page = page;
        this.phone_number = phone_number;
    }
}

