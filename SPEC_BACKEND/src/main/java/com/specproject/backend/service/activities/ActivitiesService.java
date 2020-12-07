
package com.specproject.backend.service.activities;

import com.specproject.backend.domain.activities.Activities;
import com.specproject.backend.domain.activities.ActivitiesRepository;
import com.specproject.backend.web.dto.activities.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;
@RequiredArgsConstructor
@Service
public class ActivitiesService {
  private final com.specproject.backend.domain.activities.ActivitiesRepository activitiesRepository;

  @Transactional
  public com.specproject.backend.web.dto.activities.ActivitiesSaveResponseDto save(com.specproject.backend.web.dto.activities.ActivitiesSaveRequestDto requestDto) {
 // 활동 등록
        Activities activities = requestDto.toEntity();

        activitiesRepository.save(activities);

        return ActivitiesSaveResponseDto.builder()
                .success(true)
                .message("활동이 등록되었습니다.")
                .build();
  }

  @Transactional(readOnly = true)
  public List<com.specproject.backend.web.dto.activities.ActivitiesListResponseDto> findAllDesc() {
        return activitiesRepository.findAllDesc().stream().map(ActivitiesListResponseDto::new).collect(Collectors.toList());
  }

  @Transactional
  public List<com.specproject.backend.web.dto.activities.ActivitiesListResponseDto> findActNameORContents(String keyword) {
        return activitiesRepository.findActNameORContents(keyword).stream().map(ActivitiesListResponseDto::new).collect(Collectors.toList());
  }

  @Transactional
  public List<com.specproject.backend.web.dto.activities.ActivitiesListResponseDto> findTag(String tag) {
        return activitiesRepository.findTag(tag).stream().map(ActivitiesListResponseDto::new).collect(Collectors.toList());
  }

  @Transactional(readOnly = true)
  public com.specproject.backend.web.dto.activities.ActivitiesResponseDto findById(Long act_id) {
        Activities entity = activitiesRepository.findById(act_id).orElseThrow(() -> new IllegalArgumentException("해당 활동이 없습니다. id=" + act_id));
        return new ActivitiesResponseDto(entity);
  }

  @Transactional
  public com.specproject.backend.web.dto.activities.ActivitiesUpdateResponseDto update(Long act_id, com.specproject.backend.web.dto.activities.ActivitiesUpdateRequestDto requestDto) {
        Activities activities = activitiesRepository.findById(act_id).orElseThrow(() -> new IllegalArgumentException("해당 활동이 없습니다. id=" + act_id));

        activities.update(requestDto.getClick_count());

        return ActivitiesUpdateResponseDto.builder()
                .success(true)
                .message("활동이 수정되었습니다.")
                .build();
  }

}
