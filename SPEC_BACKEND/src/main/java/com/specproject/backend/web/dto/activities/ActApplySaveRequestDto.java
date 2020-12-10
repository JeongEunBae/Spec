package com.specproject.backend.web.dto.activities;

import com.specproject.backend.domain.activities.ActApply;
import com.specproject.backend.domain.activities.Activities;
import com.specproject.backend.web.dto.ResponseDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ActApplySaveRequestDto extends ResponseDto {
    private Activities activities;
    private String userID;
    private String email;
    private String file;

    @Builder
    public ActApplySaveRequestDto(Activities activities, String userID, String email, String file) {
        this.activities = activities;
        this.userID = userID;
        this.email = email;
        this.file = file;
    }

    public ActApply toEntity() {
        return ActApply.builder().activities(activities).userID(userID).email(email).file(file).build();
    }
}
