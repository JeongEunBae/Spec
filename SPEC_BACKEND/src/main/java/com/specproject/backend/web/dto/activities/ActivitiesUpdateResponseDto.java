package com.specproject.backend.web.dto.activities;

import com.specproject.backend.web.dto.ResponseDto;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ActivitiesUpdateResponseDto extends ResponseDto {
    @Builder
    public ActivitiesUpdateResponseDto(Boolean success, String message){
        super(success, message);
    }
}
