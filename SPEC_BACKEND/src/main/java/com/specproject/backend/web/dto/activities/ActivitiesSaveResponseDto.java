package com.specproject.backend.web.dto.activities;

import com.specproject.backend.web.dto.ResponseDto;
import lombok.Builder;

public class ActivitiesSaveResponseDto extends ResponseDto {

    @Builder
    public ActivitiesSaveResponseDto(Boolean success, String message) {
        super(success, message);
    }
}
