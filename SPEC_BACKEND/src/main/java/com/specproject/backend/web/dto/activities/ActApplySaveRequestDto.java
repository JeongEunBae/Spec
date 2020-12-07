
package com.specproject.backend.web.dto.activities;

import com.specproject.backend.domain.activities.ActApply;
import com.specproject.backend.domain.activities.Activities;
import com.specproject.backend.web.dto.ResponseDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor
public class ActApplySaveRequestDto extends com.specproject.backend.web.dto.ResponseDto {
  private com.specproject.backend.domain.activities.Activities activities;

  private String userID;

  private String email;

  private String file;

  @Builder
  public ActApplySaveRequestDto(com.specproject.backend.domain.activities.Activities activities, String userID, String email, String file) {
        this.activities = activities;
        this.userID = userID;
        this.email = email;
        this.file = file;
  }

  public com.specproject.backend.domain.activities.ActApply toEntity() {
        return ActApply.builder().activities(activities).userID(userID).email(email).file(file).build();
  }

}
