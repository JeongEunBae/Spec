package com.specproject.backend.web.controller.activities;

import com.specproject.backend.service.activities.ActivitiesService;
import com.specproject.backend.web.dto.activities.ActivitiesResponseDto;
import com.specproject.backend.web.dto.activities.ActivitiesSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ActivitiesApiController {
    private final ActivitiesService activitysService;

    @PatchMapping("/api/v1/activities")
    public Long save(@RequestBody ActivitiesSaveRequestDto requestDto) {
        return activitysService.save(requestDto);
    }

    @GetMapping("/api/v1/activities/{id}")
    public ActivitiesResponseDto findById(@PathVariable Long actId) {
        return activitysService.findById(actId);
    }

}
