package com.specproject.backend.web.dto.comments;

import com.specproject.backend.domain.activities.Activities;
import com.specproject.backend.domain.comments.Comments;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommentsSaveRequestDto {
    private Activities activities;
    private String userID;
    private String contents;

    @Builder
    public CommentsSaveRequestDto(Activities activities, String userID, String contents) {
        this.activities = activities;
        this.userID = userID;
        this.contents = contents;
    }

    public Comments toEntity() {
        return Comments.builder().activities(activities).userID(userID).contents(contents).build();
    }
}
