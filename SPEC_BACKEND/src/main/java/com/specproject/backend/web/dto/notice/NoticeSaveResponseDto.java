
package com.specproject.backend.web.dto.notice;

import com.specproject.backend.web.dto.ResponseDto;
import lombok.Builder;
public class NoticeSaveResponseDto extends com.specproject.backend.web.dto.ResponseDto {
  @Builder
  public NoticeSaveResponseDto(Boolean success, String message) {
 super (success, message);
  }

}
