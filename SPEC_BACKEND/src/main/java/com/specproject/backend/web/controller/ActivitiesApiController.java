
package com.specproject.backend.web.controller;

import com.specproject.backend.service.activities.ActivitiesService;
import com.specproject.backend.web.dto.activities.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1/activities")
public class ActivitiesApiController {
  private final com.specproject.backend.service.activities.ActivitiesService activitiesService;

  @PostMapping
  public com.specproject.backend.web.dto.activities.ActivitiesSaveResponseDto
  save(@RequestBody com.specproject.backend.web.dto.activities.ActivitiesSaveRequestDto requestDto)
  {
        return activitiesService.save(requestDto);
  }

  @GetMapping(value = "/search")
  public List<com.specproject.backend.web.dto.activities.ActivitiesListResponseDto> findAllDesc() {
        return activitiesService.findAllDesc();
  }

  @GetMapping(value = "/{act_id}")
  public com.specproject.backend.web.dto.activities.ActivitiesResponseDto findById(@PathVariable Long act_id) {
        return activitiesService.findById(act_id);
  }

  @GetMapping(value = "/search_keyword") // 키워드로 검색
  public List<com.specproject.backend.web.dto.activities.ActivitiesListResponseDto>
  findActNameORContents(@RequestParam(value = "keyword") String keyword) {
        return activitiesService.findActNameORContents(keyword);
  }

  @GetMapping(value = "/search_tag") // 태그로 검색
  public List<com.specproject.backend.web.dto.activities.ActivitiesListResponseDto>
  findTag(@RequestParam(value = "tag") String tag) {
        return activitiesService.findTag(tag);
  }

  @PutMapping(value = "/{act_id}")
  public com.specproject.backend.web.dto.activities.ActivitiesUpdateResponseDto
  update(@PathVariable Long act_id, @RequestBody com.specproject.backend.web.dto.activities.ActivitiesUpdateRequestDto requestDto) {
        return activitiesService.update(act_id, requestDto);
  }

}
