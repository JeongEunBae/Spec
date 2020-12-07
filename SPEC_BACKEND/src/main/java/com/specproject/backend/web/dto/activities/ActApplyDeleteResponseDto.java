
package com.specproject.backend.web.dto.activities;

import com.specproject.backend.web.dto.ResponseDto;
import lombok.Builder;
public class ActApplyDeleteResponseDto extends com.specproject.backend.web.dto.ResponseDto {
  @Builder
  public ActApplyDeleteResponseDto(Boolean success, String message) {
        super(success, message);
  }

}
