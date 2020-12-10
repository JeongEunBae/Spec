package com.specproject.backend;

import com.specproject.backend.domain.activities.Activities;
import com.specproject.backend.domain.activities.ActivitiesRepository;
import com.specproject.backend.domain.comments.Comments;
import com.specproject.backend.domain.comments.CommentsRepository;
import com.specproject.backend.service.activities.ActivitiesService;
import com.specproject.backend.service.comments.CommentsService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.swing.*;
import java.sql.Timestamp;

@EnableJpaAuditing
@SpringBootApplication
@ComponentScan(basePackages = {"com.specproject.backend"})
public class Application {
    public static void main(String[] args) { SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner runner(ActivitiesService activitiesService, ActivitiesRepository activitiesRepository, CommentsService commentsService, CommentsRepository commentsRepository) {
        return (args) -> {
            activitiesRepository.findAll();
            activitiesRepository.save(Activities.builder().actName("이건되니1").organizerPlan("배정은").organizerManage("배정은").tag("배정은").startPeriod("20-10-04 12:12:12")
                    .endPeriod("20-10-04 12:12:12").contents("수고").price(1).poster("수고").file("수고").manager("수고").page("수고").phone_number("수고")
                    .maxPeople(1).click_count(0).build());
            Activities activities = activitiesRepository.save(Activities.builder().actName("이건되니2").organizerPlan("배정은").organizerManage("배정은").tag("배정은").startPeriod("20-10-04 12:12:12")
                    .endPeriod("20-10-04 12:12:12").contents("수고").price(1).poster("수고").file("수고").manager("수고").page("수고").phone_number("수고")
                    .maxPeople(1).click_count(0).build());

            commentsRepository.save(Comments.builder().activities(activities).userID("wjddms").contents("sdskjfdskfd").build());
        };
    }

}
