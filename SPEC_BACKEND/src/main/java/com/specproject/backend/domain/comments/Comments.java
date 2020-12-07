
package com.specproject.backend.domain.comments;

import com.specproject.backend.domain.BaseEntity;
import com.specproject.backend.domain.activities.Activities;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import javax.persistence.*;
@Getter
@Entity
@NoArgsConstructor
@Component
public class Comments extends com.specproject.backend.domain.BaseEntity {
  /**
   *  Primary KEY 지정
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long comment_id;

  /**
   *  Foreign KEY 지정
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "act_id", nullable = false)
  private com.specproject.backend.domain.activities.Activities activities;

  /**
   *  데이터 사이즈 조정, null 여부 설정
   */
  @Column(length = 100, nullable = false)
  private String userID;

  /**
   *  데이터 형식 변경
   */
  @Column(columnDefinition = "TEXT")
  private String contents;

  @Builder
  private Comments(com.specproject.backend.domain.activities.Activities activities, String userID, String contents) {
        this.activities = activities;
        this.userID = userID;
        this.contents = contents;
  }

}
