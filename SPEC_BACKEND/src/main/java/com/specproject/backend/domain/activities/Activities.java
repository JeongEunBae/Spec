package com.specproject.backend.domain.activities;

import com.specproject.backend.domain.BaseEntity;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Component
@NoArgsConstructor(access= AccessLevel.PROTECTED)
public class Activities extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Primary KEY 지정
    private Long act_id;

    @Column(length = 500, nullable = false)
    private String actName;

    @Column
    private String organizerPlan;

    @Column
    private String organizerManage;

    @Column(nullable = false)
    private String tag;

    @Column(columnDefinition = "DATETIME", nullable = false) // 데이터 형식 변경, null 여부 설정
    private String startPeriod;

    @Column(columnDefinition = "DATETIME", nullable = false)
    private String endPeriod;

    @Column(columnDefinition = "TEXT")
    private String contents;

    @Column(columnDefinition = "INT")
    private int price;

    @Column(columnDefinition = "MEDIUMBLOB")
    private String poster;

    @Column(columnDefinition = "LONGTEXT")
    private String file;

    @Column(length = 30) // 데이터 사이즈 조정, null 여부 설정
    private String manager;

    private String page;

    @Column(length = 30)
    private String phone_number;

    @Column(columnDefinition = "INT")
    private int maxPeople;

    @Column(nullable = false)
    private int click_count;

    @Builder
    public Activities(String actName, String organizerPlan, String organizerManage,
                      String tag, String startPeriod, String endPeriod, String contents,
                      int price, String poster, String file, String manager, String page, String phone_number, int maxPeople, int click_count) {
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
        this.maxPeople = maxPeople;
        this.click_count = click_count;
    }
}

