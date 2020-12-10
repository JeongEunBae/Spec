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
    private final ActApplyService actApplyService;

    @PostMapping
    public ActApplySaveResponseDto save(@RequestBody ActApplySaveRequestDto requestDto) {
        return actApplyService.save(requestDto);
    }

    @GetMapping(value = "/all")
    public List<ActApplyListResponseDto> findAll() {
        return actApplyService.findAll();
    }

    @GetMapping(value = "/{act_apply_id}")
    public ActApplyResponseDto findById(@PathVariable Long act_apply_id) {
        return actApplyService.findById(act_apply_id);
    }

    @DeleteMapping(value = "/{act_apply_id}")
    public ActApplyDeleteResponseDto delete(@PathVariable Long act_apply_id) {
        return actApplyService.delete(act_apply_id);
    }

}
