package com.specproject.backend.web;

import com.specproject.backend.domain.posts.PostsService;
import com.specproject.backend.service.activities.ActivitiesService;
import com.specproject.backend.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {
    //private final PostsService postsService;
    private final ActivitiesService activitiesService;

    @GetMapping("/")
    public String index(Model model) {
        //model.addAttribute("posts", postsService.findAllDesc());
        model.addAttribute("activities", activitiesService.findAll());
        return "index";
    }

    //@GetMapping("/posts/save")


    //public String postsSave() { return "posts-save"; }
    @GetMapping("/activities/save")
    public String activitiesSave() {
        return "activities-save";
    }

    /*
    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);
        return "posts-update";
    }
    */
}

