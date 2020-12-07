
package com.specproject.backend.web.dto.activities;

import com.specproject.backend.web.dto.ResponseDto;
import lombok.Builder;
import lombok.Getter;
@Getter
public class ActivitiesUpdateRequestDto extends com.specproject.backend.web.dto.ResponseDto {
  private int click_count;

  @Builder
  public ActivitiesUpdateRequestDto(int click_count) {
        this.click_count = click_count;
  }

}
