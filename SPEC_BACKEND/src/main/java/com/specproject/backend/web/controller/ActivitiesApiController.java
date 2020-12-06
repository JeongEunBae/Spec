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
    private final ActivitiesService activitiesService;

    @PostMapping
    public ActivitiesSaveResponseDto save(@RequestBody ActivitiesSaveRequestDto requestDto) {
        return activitiesService.save(requestDto);
    }

    @GetMapping(value = "/search")
    public List<ActivitiesListResponseDto> findAllDesc() {
        return activitiesService.findAllDesc();
    }

    @GetMapping(value = "/{act_id}")
    public ActivitiesResponseDto findById(@PathVariable Long act_id) {
        return activitiesService.findById(act_id);
    }

    @GetMapping(value = "/search_keyword")
    public List<ActivitiesListResponseDto> findActNameORContents(@PathVariable @RequestParam(value = "keyword") String keyword) {
        return activitiesService.findActNameORContents(keyword);
    }

    @GetMapping(value = "/search_tag")
    public List<ActivitiesListResponseDto> findTag(@PathVariable @RequestParam(value = "tag") String tag) {
        return activitiesService.findTag(tag);
    }

    @PutMapping(value = "/{act_id}")
    public ActivitiesUpdateResponseDto update(@PathVariable Long act_id, @RequestBody ActivitiesUpdateRequestDto requestDto){
        return activitiesService.update(act_id, requestDto);
    }
}
