
package com.specproject.backend.web.dto.account;

import com.specproject.backend.domain.account.Account;
import com.specproject.backend.web.dto.ResponseDto;
import lombok.Getter;
@Getter
public class AccountListResponseDto extends com.specproject.backend.web.dto.ResponseDto {
  private Long account_id;

  private String user_id;

  private String user_name;

  private String category;

  public AccountListResponseDto(com.specproject.backend.domain.account.Account entity) {
        this.account_id = entity.getAccount_id();
        this.user_id = entity.getUser_id();
        this.user_name = entity.getUser_name();
        this.category = entity.getCategory();
  }

}
