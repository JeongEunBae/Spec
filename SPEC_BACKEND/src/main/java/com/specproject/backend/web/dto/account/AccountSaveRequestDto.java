
package com.specproject.backend.web.dto.account;

import com.specproject.backend.domain.account.Account;
import com.specproject.backend.domain.activities.Activities;
import com.specproject.backend.web.dto.ResponseDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor
public class AccountSaveRequestDto extends com.specproject.backend.web.dto.ResponseDto {
  private String user_id;

  private String user_name;

  private String category;

  @Builder
  public AccountSaveRequestDto(String user_id, String user_name, String category) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.category = category;
  }

  public com.specproject.backend.domain.account.Account toEntity() {
        return Account.builder().user_id(user_id).user_name(user_name).category(category).build();
  }

}
