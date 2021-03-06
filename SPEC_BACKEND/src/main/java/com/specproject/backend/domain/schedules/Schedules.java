
package com.specproject.backend.domain.schedules;

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
public class Schedules extends com.specproject.backend.domain.BaseEntity {
  /**
   *  Primary KEY 지정
   *  Primary KEY 지정
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long schedule_id;

  @Column(nullable = false)
  private String title;

  /**
   *  데이터 사이즈 조정, null 여부 설정
   */
  @Column(length = 100, nullable = false)
  private String userID;

  @Column(columnDefinition = "DATE", nullable = false)
  private String start_date;

  @Column(columnDefinition = "DATE", nullable = false)
  private String end_date;

  /**
   *  데이터 형식 변경
   */
  @Column(columnDefinition = "INT")
  private int color_index;

  @Column(columnDefinition = "LONGTEXT")
  private String memo;

  @Builder
  public Schedules(String title, String userID, String start_date, String end_date, int color_index, String memo) {
        this.title = title;
        this.userID = userID;
        this.start_date = start_date;
        this.end_date = end_date;
        this.color_index = color_index;
        this.memo = memo;
  }

  public void update(String title, String userID, String start_date, String end_date, int color_index, String memo) {
        this.title = title;
        this.userID = userID;
        this.start_date = start_date;
        this.end_date = end_date;
        this.color_index = color_index;
        this.memo = memo;
  }

}
