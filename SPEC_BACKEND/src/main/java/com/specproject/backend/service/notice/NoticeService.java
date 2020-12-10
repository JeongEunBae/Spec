package com.specproject.backend.service.notice;

import com.specproject.backend.domain.notice.Notice;
import com.specproject.backend.domain.notice.NoticeRepository;
import com.specproject.backend.web.dto.notice.NoticeListResponseDto;
import com.specproject.backend.web.dto.notice.NoticeResponseDto;
import com.specproject.backend.web.dto.notice.NoticeSaveRequestDto;
import com.specproject.backend.web.dto.notice.NoticeSaveResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class NoticeService {
    private final NoticeRepository noticeRepository;

    @Transactional
    public NoticeSaveResponseDto save(NoticeSaveRequestDto requestDto) { // 공지사항 등록
        Notice notice = requestDto.toEntity();

        noticeRepository.save(notice);

        return NoticeSaveResponseDto.builder()
                .success(true)
                .message("공지사항이 등록되었습니다.")
                .build();
    }

    @Transactional(readOnly = true)
    public List<NoticeListResponseDto> findAll() {
        return noticeRepository.findAll().stream().map(NoticeListResponseDto::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public NoticeResponseDto findById(Long notice_id) {
        Notice entity = noticeRepository.findById(notice_id).orElseThrow(() -> new IllegalArgumentException("해당 공지사항이 없습니다. id=" + notice_id));
        return new NoticeResponseDto(entity);
    }
}