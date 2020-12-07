
package com.specproject.backend.service.comments;

import com.specproject.backend.domain.comments.Comments;
import com.specproject.backend.domain.comments.CommentsRepository;
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
public class CommentsService {
  private final com.specproject.backend.domain.comments.CommentsRepository commentsRepository;

  @Transactional
  public com.specproject.backend.web.dto.comments.CommentsSaveResponseDto save(com.specproject.backend.web.dto.comments.CommentsSaveRequestDto requestDto) {
 // 댓글 등록
        Comments comments = requestDto.toEntity();

        commentsRepository.save(comments);

        return CommentsSaveResponseDto.builder()
                .success(true)
                .message("댓글이 등록되었습니다.")
                .build();
  }

  @Transactional(readOnly = true)
  public List<com.specproject.backend.web.dto.comments.CommentsListResponseDto> findAll() {
        return commentsRepository.findAll().stream().map(CommentsListResponseDto::new).collect(Collectors.toList());
  }

}
