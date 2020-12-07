
package com.specproject.backend.web.dto.activities;

import com.specproject.backend.domain.activities.Activities;
import com.specproject.backend.web.dto.ResponseDto;
import lombok.Getter;
@Getter
public class ActivitiesListResponseDto extends com.specproject.backend.web.dto.ResponseDto {
  private Long act_id;

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

  public ActivitiesListResponseDto(com.specproject.backend.domain.activities.Activities entity) {
        this.act_id = entity.getAct_id();
        this.actName = entity.getActName();
        this.organizerPlan = entity.getOrganizerPlan();
        this.organizerManage = entity.getOrganizerManage();
        this.tag = entity.getTag();
        this.startPeriod = entity.getStartPeriod();
        this.endPeriod = entity.getEndPeriod();
        this.contents = entity.getContents();
        this.price = entity.getPrice();
        this.poster = entity.getPoster();
        this.file = entity.getFile();
        this.manager = entity.getManager();
        this.page = entity.getPage();
        this.phone_number = entity.getPhone_number();
        this.maxPeople = entity.getMaxPeople();
        this.click_count = entity.getClick_count();
  }

}
