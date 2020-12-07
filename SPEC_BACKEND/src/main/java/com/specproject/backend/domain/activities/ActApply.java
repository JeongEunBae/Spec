
package com.specproject.backend.domain.activities;

import com.specproject.backend.domain.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import javax.persistence.*;
@Getter
@Entity
@NoArgsConstructor
@Component
public class ActApply extends com.specproject.backend.domain.BaseEntity {
  /**
   *  Primary KEY 지정
   *  Primary KEY 지정
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long act_apply_id;

  /**
   *  Foreign KEY 지정
   */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "act_id", nullable = false)
  private Activities activities;

  /**
   *  데이터 사이즈 조정, null 여부 설정
   */
  @Column(length = 100, nullable = false)
  private String userID;

  @Column(nullable = false)
  private String email;

  /**
   *  데이터 형식 변경
   */
  @Column(columnDefinition = "LONGTEXT")
  private String file;

  @Builder
  private ActApply(Activities activities, String userID, String email, String file) {
        this.activities = activities;
        this.userID = userID;
        this.email = email;
        this.file = file;
  }

}
