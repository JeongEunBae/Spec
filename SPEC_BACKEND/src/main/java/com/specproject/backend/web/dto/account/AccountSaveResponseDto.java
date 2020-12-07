
package com.specproject.backend.web.dto.account;

import com.specproject.backend.web.dto.ResponseDto;
import lombok.Builder;
public class AccountSaveResponseDto extends com.specproject.backend.web.dto.ResponseDto {
  @Builder
  public AccountSaveResponseDto(Boolean success, String message) {
        super(success, message);
  }

}
