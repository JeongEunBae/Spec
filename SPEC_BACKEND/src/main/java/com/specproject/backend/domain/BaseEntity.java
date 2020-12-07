
package com.specproject.backend.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
/**
 *  모든 Entity의 상위 클래스
 *  모든 Entity의 상위 클래스
 *  Auditing 기능 포함
 */
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
  @CreatedDate
  private LocalDateTime createDate;

  @LastModifiedDate
  private LocalDateTime modifiedDate;

}
