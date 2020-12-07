
package com.specproject.backend.web.controller;

import com.specproject.backend.service.activities.ActApplyService;
import com.specproject.backend.web.dto.activities.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1/act_apply")
public class ActApplyController {
  private final com.specproject.backend.service.activities.ActApplyService actApplyService;

  @PostMapping
  public com.specproject.backend.web.dto.activities.ActApplySaveResponseDto save(@RequestBody com.specproject.backend.web.dto.activities.ActApplySaveRequestDto requestDto) {
        return actApplyService.save(requestDto);
  }

  @GetMapping(value = "/all")
  public List<com.specproject.backend.web.dto.activities.ActApplyListResponseDto> findAll() {
        return actApplyService.findAll();
  }

  @GetMapping(value = "/{act_apply_id}")
  public com.specproject.backend.web.dto.activities.ActApplyResponseDto findById(@PathVariable Long act_apply_id) {
        return actApplyService.findById(act_apply_id);
  }

  @DeleteMapping(value = "/{act_apply_id}")
  public com.specproject.backend.web.dto.activities.ActApplyDeleteResponseDto delete(@PathVariable Long act_apply_id) {
        return actApplyService.delete(act_apply_id);
  }

}
