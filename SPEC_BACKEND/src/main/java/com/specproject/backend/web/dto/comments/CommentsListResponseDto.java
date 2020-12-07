
package com.specproject.backend.web.dto.comments;

import com.specproject.backend.domain.activities.Activities;
import com.specproject.backend.domain.comments.Comments;
import com.specproject.backend.web.dto.ResponseDto;
import lombok.Getter;
@Getter
public class CommentsListResponseDto extends com.specproject.backend.web.dto.ResponseDto {
  private Long comment_id;

  private com.specproject.backend.domain.activities.Activities activities;

  private String userID;

  private String contents;

  public CommentsListResponseDto(com.specproject.backend.domain.comments.Comments entity) {
        this.comment_id = entity.getComment_id();
        this.activities = entity.getActivities();
        this.userID = entity.getUserID();
        this.contents = entity.getContents();

  }

}
