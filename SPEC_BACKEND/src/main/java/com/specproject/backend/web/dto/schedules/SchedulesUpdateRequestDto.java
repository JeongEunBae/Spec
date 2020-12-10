package com.specproject.backend.web.dto.schedules;

import com.specproject.backend.web.dto.ResponseDto;
import lombok.Builder;
import lombok.Getter;

@Getter
public class SchedulesUpdateRequestDto extends ResponseDto {
    private String title;
    private String userID;
    private String start_date;
    private String end_date;
    private int color_index;
    private String memo;

    @Builder
    public SchedulesUpdateRequestDto(String title, String userID, String start_date, String end_date, int color_index, String memo) {
        this.title = title;
        this.userID = userID;
        this.start_date = start_date;
        this.end_date = end_date;
        this.color_index = color_index;
        this.memo = memo;
    }
}
