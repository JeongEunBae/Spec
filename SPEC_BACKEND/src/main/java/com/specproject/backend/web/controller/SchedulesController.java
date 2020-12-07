
package com.specproject.backend.web.controller;

import com.specproject.backend.service.schedules.SchedulesService;
import com.specproject.backend.web.dto.schedules.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1/schedules")
public class SchedulesController {
  private final com.specproject.backend.service.schedules.SchedulesService schedulesService;

  @PostMapping
  public com.specproject.backend.web.dto.schedules.SchedulesSaveResponseDto save(@RequestBody com.specproject.backend.web.dto.schedules.SchedulesSaveRequestDto requestDto) {
        return schedulesService.save(requestDto);
  }

  @GetMapping(value = "/all")
  public List<com.specproject.backend.web.dto.schedules.SchedulesListResponseDto> findAll() {
        return schedulesService.findAll();
  }

  @GetMapping(value = "/search_title")
  public List<com.specproject.backend.web.dto.schedules.SchedulesListResponseDto> findTitle(@RequestParam(value = "title") String title) {
        return schedulesService.findTitle(title);
  }

  @GetMapping(value = "/search_date")
  public List<com.specproject.backend.web.dto.schedules.SchedulesListResponseDto> findDate(@RequestParam(value = "date") String date) {
        return schedulesService.findDate(date);
  }

  @GetMapping(value = "/search_memo")
  public List<com.specproject.backend.web.dto.schedules.SchedulesListResponseDto> findMemo(@RequestParam(value = "memo") String memo) {
        return schedulesService.findMemo(memo);
  }

  @GetMapping(value = "/{schedule_id}")
  public com.specproject.backend.web.dto.schedules.SchedulesResponseDto findById(@PathVariable Long schedule_id) {
        return schedulesService.findById(schedule_id);
  }

  @PutMapping(value = "/{schedule_id}")
  public com.specproject.backend.web.dto.schedules.SchedulesUpdateResponseDto update(@PathVariable Long schedule_id, @RequestBody com.specproject.backend.web.dto.schedules.SchedulesUpdateRequestDto requestDto) {
        return schedulesService.update(schedule_id, requestDto);
  }

  @DeleteMapping(value = "/{schedule_id}")
  public com.specproject.backend.web.dto.schedules.SchedulesDeleteResponseDto delete(@PathVariable Long schedule_id) {
        return schedulesService.delete(schedule_id);
  }

}
