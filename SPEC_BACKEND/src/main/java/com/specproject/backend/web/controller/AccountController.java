
package com.specproject.backend.web.controller;

import com.specproject.backend.service.account.AccountService;
import com.specproject.backend.service.activities.ActApplyService;
import com.specproject.backend.web.dto.account.AccountListResponseDto;
import com.specproject.backend.web.dto.account.AccountSaveRequestDto;
import com.specproject.backend.web.dto.account.AccountSaveResponseDto;
import com.specproject.backend.web.dto.comments.CommentsListResponseDto;
import com.specproject.backend.web.dto.comments.CommentsSaveRequestDto;
import com.specproject.backend.web.dto.comments.CommentsSaveResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1/account")
public class AccountController {
  private final com.specproject.backend.service.account.AccountService accountService;

  @PostMapping
  public com.specproject.backend.web.dto.account.AccountSaveResponseDto save(@RequestBody com.specproject.backend.web.dto.account.AccountSaveRequestDto requestDto) {
        return accountService.save(requestDto);
  }

  @GetMapping(value = "/all")
  public List<com.specproject.backend.web.dto.account.AccountListResponseDto> findAll() {
        return accountService.findAll();
  }

}
