package com.specproject.backend.web.dto.schedules;

import com.specproject.backend.domain.activities.Activities;
import com.specproject.backend.domain.schedules.Schedules;
import com.specproject.backend.web.dto.ResponseDto;
import lombok.Getter;

@Getter
public class SchedulesListResponseDto extends ResponseDto {
    private Long schedule_id;
    private String title;
    private String userID;
    private String start_date;
    private String end_date;
    private int color_index;
    private String memo;

    public SchedulesListResponseDto(Schedules entity) {
        this.schedule_id = entity.getSchedule_id();
        this.title = entity.getTitle();
        this.userID = entity.getUserID();
        this.start_date = entity.getStart_date();
        this.end_date = entity.getEnd_date();
        this.color_index = entity.getColor_index();
        this.memo = entity.getMemo();
    }
}
