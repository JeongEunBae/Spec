
package com.specproject.backend.web.dto.activities;

import com.specproject.backend.domain.activities.Activities;
import com.specproject.backend.web.dto.ResponseDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor
public class ActivitiesSaveRequestDto extends com.specproject.backend.web.dto.ResponseDto {
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

  private int maxPeople;

  private int click_count;

  @Builder
  public ActivitiesSaveRequestDto(String actName, String organizerPlan, String organizerManage, String tag, String startPeriod, String endPeriod, String contents, int price, String poster, String file, String manager, String page, String phone_number, int maxPeople, int click_count) {
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

  public com.specproject.backend.domain.activities.Activities toEntity() {
        return Activities.builder().actName(actName).organizerPlan(organizerPlan).organizerManage(organizerManage).tag(tag).startPeriod(startPeriod)
                .endPeriod(endPeriod).contents(contents).price(price).poster(poster).file(file).manager(manager).page(page).phone_number(phone_number)
                .maxPeople(maxPeople).click_count(click_count).build();
  }

}
