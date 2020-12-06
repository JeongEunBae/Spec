package com.specproject.backend.web.dto.notice;

import com.specproject.backend.web.dto.ResponseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class NoticeSaveRequestDto extends ResponseDto {
    private String category;
    private String create_date;
    private String contents;

    public NoticeSaveRequestDto(String category, String create_date, String contents) {

    }

}
