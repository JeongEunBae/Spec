
package com.specproject.backend.service.activities;

import com.specproject.backend.domain.activities.ActApply;
import com.specproject.backend.domain.activities.ActApplyRepository;
import com.specproject.backend.web.dto.activities.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;
@RequiredArgsConstructor
@Service
public class ActApplyService {
  private final com.specproject.backend.domain.activities.ActApplyRepository actApplyRepository;

  @Transactional
  public com.specproject.backend.web.dto.activities.ActApplySaveResponseDto save(com.specproject.backend.web.dto.activities.ActApplySaveRequestDto requestDto) {
 // 활동 등록
        ActApply actApply = requestDto.toEntity();

        actApplyRepository.save(actApply);

        return ActApplySaveResponseDto.builder()
                .success(true)
                .message("신청되었습니다.")
                .build();
  }

  @Transactional(readOnly = true)
  public List<com.specproject.backend.web.dto.activities.ActApplyListResponseDto> findAll() {
        return actApplyRepository.findAll().stream().map(ActApplyListResponseDto::new).collect(Collectors.toList());
  }

  public com.specproject.backend.web.dto.activities.ActApplyResponseDto findById(Long act_apply_id) {
        ActApply entity = actApplyRepository.findById(act_apply_id).orElseThrow(() -> new IllegalArgumentException("해당 활동이 없습니다. id=" + act_apply_id));

        return new ActApplyResponseDto(entity);
  }

  @Transactional
  public com.specproject.backend.web.dto.activities.ActApplyDeleteResponseDto delete(Long act_apply_id) {
        ActApply actApply = actApplyRepository.findById(act_apply_id).orElseThrow(() -> new IllegalArgumentException("해당 활동이 없습니다. id=" + act_apply_id));

        actApplyRepository.delete(actApply);

        return ActApplyDeleteResponseDto.builder()
                .success(true)
                .message("해당 활동을 신청내역에서 삭제되었습니다.")
                .build();
  }

}
