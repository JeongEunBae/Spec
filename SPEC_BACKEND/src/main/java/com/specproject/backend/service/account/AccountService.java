
package com.specproject.backend.service.account;

import com.specproject.backend.domain.account.Account;
import com.specproject.backend.domain.account.AccountRepository;
import com.specproject.backend.domain.activities.Activities;
import com.specproject.backend.domain.comments.Comments;
import com.specproject.backend.domain.comments.CommentsRepository;
import com.specproject.backend.web.dto.account.AccountListResponseDto;
import com.specproject.backend.web.dto.account.AccountSaveRequestDto;
import com.specproject.backend.web.dto.account.AccountSaveResponseDto;
import com.specproject.backend.web.dto.activities.ActivitiesSaveRequestDto;
import com.specproject.backend.web.dto.activities.ActivitiesSaveResponseDto;
import com.specproject.backend.web.dto.comments.CommentsListResponseDto;
import com.specproject.backend.web.dto.comments.CommentsSaveRequestDto;
import com.specproject.backend.web.dto.comments.CommentsSaveResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;
@RequiredArgsConstructor
@Service
public class AccountService {
  private final com.specproject.backend.domain.account.AccountRepository accountRepository;

  @Transactional
  public com.specproject.backend.web.dto.account.AccountSaveResponseDto save(com.specproject.backend.web.dto.account.AccountSaveRequestDto requestDto) {
 // 댓글 등록
        Account account = requestDto.toEntity();

        accountRepository.save(account);

        return AccountSaveResponseDto.builder()
                .success(true)
                .message("계정이 등록되었습니다.")
                .build();
  }

  @Transactional(readOnly = true)
  public List<com.specproject.backend.web.dto.account.AccountListResponseDto> findAll() {
        return accountRepository.findAll().stream().map(AccountListResponseDto::new).collect(Collectors.toList());
  }

}
