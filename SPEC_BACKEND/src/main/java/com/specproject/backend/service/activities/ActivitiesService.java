package com.specproject.backend.service.activities;

import com.specproject.backend.domain.activities.Activities;
import com.specproject.backend.domain.activities.ActivitiesRepository;
import com.specproject.backend.web.dto.activities.ActivitiesListResponseDto;
import com.specproject.backend.web.dto.activities.ActivitiesResponseDto;
import com.specproject.backend.web.dto.activities.ActivitiesSaveRequestDto;
import com.specproject.backend.web.dto.activities.ActivitiesSaveResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ActivitiesService {
    private final ActivitiesRepository activitiesRepository;

    @Transactional
    public ActivitiesSaveResponseDto save(ActivitiesSaveRequestDto requestDto) { // 활동 등록
        Activities activities = requestDto.toEntity();

        activitiesRepository.save(activities);

        return ActivitiesSaveResponseDto.builder()
                .success(true)
                .message("활동이 등록되었습니다.")
                .build();
    }

    @Transactional(readOnly = true)
    public List<ActivitiesListResponseDto> findAll() {
        return activitiesRepository.findAll().stream().map(ActivitiesListResponseDto::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public ActivitiesResponseDto findById(Long act_id) {
        Activities entity = activitiesRepository.findById(act_id).orElseThrow(() -> new IllegalArgumentException("해당 활동이 없습니다. id=" + act_id));
        return new ActivitiesResponseDto(entity);
    }
}
