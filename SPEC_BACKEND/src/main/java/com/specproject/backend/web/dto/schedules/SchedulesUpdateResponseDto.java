
package com.specproject.backend.web.dto.schedules;

import com.specproject.backend.web.dto.ResponseDto;
import lombok.Builder;
import lombok.NoArgsConstructor;
@NoArgsConstructor
public class SchedulesUpdateResponseDto extends com.specproject.backend.web.dto.ResponseDto {
  @Builder
  public SchedulesUpdateResponseDto(Boolean success, String message) {
        super(success, message);
  }

}
