package com.specproject.backend.web.dto.activities;

import com.specproject.backend.web.dto.ResponseDto;
import lombok.Builder;

public class ActApplySaveResponseDto extends ResponseDto {

    @Builder
    public ActApplySaveResponseDto(Boolean success, String message) {
        super (success, message);
    }
}
