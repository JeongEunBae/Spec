package com.specproject.backend.web;

import com.specproject.backend.service.activities.ActivitiesService;
import com.specproject.backend.web.dto.activities.ActivitiesResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {
    private final ActivitiesService activitiesService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("activities", activitiesService.findAllDesc());
        return "index";
    }

    @GetMapping("/activities/save")
    public String activitiesSave() {
        return "activities-save";
    }

    @GetMapping("/activities/update/{id}")
    public String activitiesUpdate(@PathVariable Long id, Model model) {
        ActivitiesResponseDto dto = activitiesService.findById(id);
        model.addAttribute("activity", dto);
        return "activities-update";
    }
}
