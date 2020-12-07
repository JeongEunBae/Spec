
package com.specproject.backend.web.controller;

import com.specproject.backend.service.notice.NoticeService;
import com.specproject.backend.web.dto.notice.NoticeListResponseDto;
import com.specproject.backend.web.dto.notice.NoticeResponseDto;
import com.specproject.backend.web.dto.notice.NoticeSaveRequestDto;
import com.specproject.backend.web.dto.notice.NoticeSaveResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1/notice")
public class NoticeController {
  private final com.specproject.backend.service.notice.NoticeService noticeService;

  @PostMapping
  public com.specproject.backend.web.dto.notice.NoticeSaveResponseDto save(@RequestBody com.specproject.backend.web.dto.notice.NoticeSaveRequestDto requestDto) {
        return noticeService.save(requestDto);
  }

  @GetMapping
  public List<com.specproject.backend.web.dto.notice.NoticeListResponseDto> findAll() {
        return noticeService.findAll();
  }

  @GetMapping(value = "/{notice_id}")
  public com.specproject.backend.web.dto.notice.NoticeResponseDto findById(@PathVariable Long notice_id) {
        return noticeService.findById(notice_id);
  }

}
