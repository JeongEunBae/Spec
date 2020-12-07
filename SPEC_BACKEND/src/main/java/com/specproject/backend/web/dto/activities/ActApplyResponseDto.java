package com.specproject.backend.web.dto.activities;

import com.specproject.backend.domain.activities.ActApply;
import com.specproject.backend.domain.activities.Activities;
import com.specproject.backend.web.dto.ResponseDto;
import lombok.Getter;

@Getter
public class ActApplyResponseDto extends ResponseDto{
    private Long act_apply_id;
    private Activities activities;
    private String userID;
    private String email;
    private String file;

    public ActApplyResponseDto(ActApply entity) {
        this.act_apply_id = entity.getAct_apply_id();
        this.activities = entity.getActivities();
        this.userID = entity.getUserID();
        this.email = entity.getEmail();
        this.file = entity.getFile();
    }
}
