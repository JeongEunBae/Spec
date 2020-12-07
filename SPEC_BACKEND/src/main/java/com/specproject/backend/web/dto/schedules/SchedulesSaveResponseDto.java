
package com.specproject.backend.web.dto.schedules;

import com.specproject.backend.web.dto.ResponseDto;
import lombok.Builder;
public class SchedulesSaveResponseDto extends com.specproject.backend.web.dto.ResponseDto {
  @Builder
  public SchedulesSaveResponseDto(Boolean success, String message) {
        super (success, message);
  }

}
