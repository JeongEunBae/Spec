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
    private final CommentsRepository commentsRepository;

    @Transactional
    public CommentsSaveResponseDto save(CommentsSaveRequestDto requestDto) { // 댓글 등록
        Comments comments = requestDto.toEntity();

        commentsRepository.save(comments);

        return CommentsSaveResponseDto.builder()
                .success(true)
                .message("댓글이 등록되었습니다.")
                .build();
    }

    @Transactional(readOnly = true)
    public List<CommentsListResponseDto> findAll() {
        return commentsRepository.findAll().stream().map(CommentsListResponseDto::new).collect(Collectors.toList());
    }
}
