
package com.specproject.backend.web.dto.comments;

import com.specproject.backend.web.dto.ResponseDto;
import lombok.Builder;
public class CommentsSaveResponseDto extends com.specproject.backend.web.dto.ResponseDto {
  @Builder
  public CommentsSaveResponseDto(Boolean success, String message) {
        super (success, message);
  }

}
