package com.specproject.backend.web.dto.activities;

import com.specproject.backend.domain.activities.Activities;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ActivitiesSaveRequestDto {
    private Long actID;
    private String actName;
    private String organizerPlan;
    private String organizerManage;
    private String tag;
    private String startPeriod;
    private String endPeriod;
    private String contents;
    private int price;
    private String poster;
    private String file;
    private String manager;
    private String page;
    private String phone_number;

    @Builder
    private ActivitiesSaveRequestDto(Long actID, String actName, String organizerPlan, String organizerManage,
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

    public Activities toEntity() {
        return Activities.builder().actID(actID).actName(actName).organizerPlan(organizerPlan).organizerManage(organizerManage).tag(tag).startPeriod(startPeriod)
                .endPeriod(endPeriod).contents(contents).price(price).poster(poster).file(file).page(page).phone_number(phone_number).build();
    }
}
