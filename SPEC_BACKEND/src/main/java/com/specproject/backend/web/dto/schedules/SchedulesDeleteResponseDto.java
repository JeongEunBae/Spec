package com.specproject.backend.web.dto.schedules;

import com.specproject.backend.web.dto.ResponseDto;
import lombok.Builder;

public class SchedulesDeleteResponseDto extends ResponseDto {
    @Builder
    public SchedulesDeleteResponseDto(Boolean success, String message) {
        super(success, message);
    }
}
