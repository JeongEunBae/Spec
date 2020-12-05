package com.specproject.backend.service.activities;

import com.specproject.backend.domain.activities.Activities;
import com.specproject.backend.domain.activities.ActivitiesRepository;
import com.specproject.backend.web.dto.activities.ActivitiesListResponseDto;
import com.specproject.backend.web.dto.activities.ActivitiesResponseDto;
import com.specproject.backend.web.dto.activities.ActivitiesSaveRequestDto;
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
    public Long save(ActivitiesSaveRequestDto requestDto) {
        return activitiesRepository.save(requestDto.toEntity()).getActID();
    }

    public ActivitiesResponseDto findById(Long actId) {
        Activities entity = activitiesRepository.findById(actId).orElseThrow(() ->
                new IllegalArgumentException("해당 게시글이 없습니다. id=" + actId));

        return new ActivitiesResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<ActivitiesListResponseDto> findAllDesc() {
        return activitiesRepository.findAllDesc().stream().map(ActivitiesListResponseDto::new).collect(Collectors.toList());
    }

}
