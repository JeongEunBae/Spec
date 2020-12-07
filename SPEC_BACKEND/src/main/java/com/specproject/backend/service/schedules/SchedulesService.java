package com.specproject.backend.service.schedules;

import com.specproject.backend.domain.schedules.Schedules;
import com.specproject.backend.domain.schedules.SchedulesRepository;
import com.specproject.backend.web.dto.schedules.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class SchedulesService {
    private final SchedulesRepository schedulesRepository;

    @Transactional
    public SchedulesSaveResponseDto save(SchedulesSaveRequestDto requestDto) { // 댓글 등록
        Schedules schedules = requestDto.toEntity();

        schedulesRepository.save(schedules);

        return SchedulesSaveResponseDto.builder()
                .success(true)
                .message("일정이 등록되었습니다.")
                .build();
    }

    @Transactional(readOnly = true)
    public List<SchedulesListResponseDto> findAll() {
        return schedulesRepository.findAll().stream().map(SchedulesListResponseDto::new).collect(Collectors.toList());
    }


    @Transactional
    public List<SchedulesListResponseDto> findTitle(String title) {
        return schedulesRepository.findTitle(title).stream().map(SchedulesListResponseDto::new).collect(Collectors.toList());
    }

    @Transactional
    public List<SchedulesListResponseDto> findDate(String date) {
        return schedulesRepository.findDate(date).stream().map(SchedulesListResponseDto::new).collect(Collectors.toList());
    }

    @Transactional
    public List<SchedulesListResponseDto> findMemo(String memo) {
        return schedulesRepository.findMemo(memo).stream().map(SchedulesListResponseDto::new).collect(Collectors.toList());
    }

    @Transactional
    public SchedulesUpdateResponseDto update(Long schedule_id, SchedulesUpdateRequestDto requestDto) {
        Schedules schedules = schedulesRepository.findById(schedule_id).orElseThrow(() -> new IllegalArgumentException("해당 일정이 없습니다. id=" + schedule_id));

        schedules.update(requestDto.getTitle(), requestDto.getUserID(), requestDto.getStart_date(), requestDto.getEnd_date(), requestDto.getColor_index()
                , requestDto.getMemo());

        return SchedulesUpdateResponseDto.builder()
                .success(true)
                .message("일정이 수정되었습니다.")
                .build();
    }


    public SchedulesResponseDto findById(Long schedule_id) {
        Schedules entity = schedulesRepository.findById(schedule_id).orElseThrow(() -> new IllegalArgumentException("해당 일정이 없습니다. id=" + schedule_id));

        return new SchedulesResponseDto(entity);
    }

    @Transactional
    public SchedulesDeleteResponseDto delete(Long schedule_id){
        Schedules schedules = schedulesRepository.findById(schedule_id).orElseThrow(() -> new IllegalArgumentException("해당 일정이 없습니다. id=" + schedule_id));

        schedulesRepository.delete(schedules);

        return SchedulesDeleteResponseDto.builder()
                .success(true)
                .message("해당 일정이 삭제되었습니다.")
                .build();
    }

}
