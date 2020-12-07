
package com.specproject.backend.web.dto.notice;

import com.specproject.backend.domain.notice.Notice;
import com.specproject.backend.web.dto.ResponseDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor
public class NoticeSaveRequestDto extends com.specproject.backend.web.dto.ResponseDto {
  private String category;

  private String save_date;

  private String contents;

  @Builder
  public NoticeSaveRequestDto(String category, String save_date, String contents) {
        this.category = category;
        this.save_date = save_date;
        this.contents = contents;
  }

  public com.specproject.backend.domain.notice.Notice toEntity() {
        return Notice.builder().category(category).save_date(save_date).contents(contents).build();
  }

}
