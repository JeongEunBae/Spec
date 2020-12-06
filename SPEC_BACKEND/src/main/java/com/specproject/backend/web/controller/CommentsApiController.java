package com.specproject.backend.web.controller;

import com.specproject.backend.service.comments.CommentsService;
import com.specproject.backend.web.dto.comments.CommentsListResponseDto;
import com.specproject.backend.web.dto.comments.CommentsSaveRequestDto;
import com.specproject.backend.web.dto.comments.CommentsSaveResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api/v1/comments")
public class CommentsApiController {
    private final CommentsService commentsService;

    @PostMapping
    public CommentsSaveResponseDto save(@RequestBody CommentsSaveRequestDto requestDto) {
        return commentsService.save(requestDto);
    }

    @GetMapping(value = "/all")
    public List<CommentsListResponseDto> findAll() {
        return commentsService.findAll();
    }
}
