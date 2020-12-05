package com.specproject.backend.web.controller.activities;

import com.specproject.backend.domain.activities.Activities;
import com.specproject.backend.service.activities.ActivitiesService;
import com.specproject.backend.web.dto.activities.ActivitiesListResponseDto;
import com.specproject.backend.web.dto.activities.ActivitiesResponseDto;
import com.specproject.backend.web.dto.activities.ActivitiesSaveRequestDto;
import com.specproject.backend.web.dto.activities.ActivitiesSaveResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/activities")
public class ActivitiesApiController {
    private final ActivitiesService activitiesService;

    @PostMapping
    public ActivitiesSaveResponseDto save(@RequestBody ActivitiesSaveRequestDto requestDto) {
        return activitiesService.save(requestDto);
    }

    @GetMapping
    public List<ActivitiesListResponseDto> findAll() {
        return activitiesService.findAll();
    }

    @GetMapping("/{act_id}")
    public ActivitiesResponseDto findById(@PathVariable Long act_id) {
        return activitiesService.findById(act_id);
    }

}
