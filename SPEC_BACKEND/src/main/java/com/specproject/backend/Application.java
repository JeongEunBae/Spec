
package com.specproject.backend;

import com.specproject.backend.domain.activities.ActApply;
import com.specproject.backend.domain.activities.ActApplyRepository;
import com.specproject.backend.domain.activities.Activities;
import com.specproject.backend.domain.activities.ActivitiesRepository;
import com.specproject.backend.domain.comments.Comments;
import com.specproject.backend.domain.comments.CommentsRepository;
import com.specproject.backend.domain.notice.Notice;
import com.specproject.backend.domain.notice.NoticeRepository;
import com.specproject.backend.domain.schedules.Schedules;
import com.specproject.backend.domain.schedules.SchedulesRepository;
import com.specproject.backend.service.activities.ActApplyService;
import com.specproject.backend.service.activities.ActivitiesService;
import com.specproject.backend.service.comments.CommentsService;
import com.specproject.backend.service.notice.NoticeService;
import com.specproject.backend.service.schedules.SchedulesService;
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
  public static void main(String[] args)
  {
 SpringApplication.run(Application.class, args);
  }

  @Bean
  public CommandLineRunner runner(com.specproject.backend.service.activities.ActivitiesService activitiesService, com.specproject.backend.domain.activities.ActivitiesRepository activitiesRepository, com.specproject.backend.service.comments.CommentsService commentsService, com.specproject.backend.domain.comments.CommentsRepository commentsRepository, com.specproject.backend.domain.activities.ActApplyRepository actApplyRepository, com.specproject.backend.service.activities.ActApplyService actApplyService, com.specproject.backend.domain.schedules.SchedulesRepository schedulesRepository, com.specproject.backend.service.schedules.SchedulesService schedulesService, com.specproject.backend.domain.notice.NoticeRepository noticeRepository, com.specproject.backend.service.notice.NoticeService noticeService) {
        return (args) -> {
            activitiesRepository.save(Activities.builder().actName("이건되니1").organizerPlan("배정은").organizerManage("배정은").tag("배정은").startPeriod("20-10-04 12:12:12")
                    .endPeriod("20-10-04 12:12:12").contents("수고").price(1).poster("수고").file("수고").manager("수고").page("수고").phone_number("수고")
                    .maxPeople(1).click_count(0).build());
            Activities activities = activitiesRepository.save(Activities.builder().actName("이건되니2").organizerPlan("배정은").organizerManage("배정은").tag("배정은").startPeriod("20-10-04 12:12:12")
                    .endPeriod("20-10-04 12:12:12").contents("수고").price(1).poster("수고").file("수고").manager("수고").page("수고").phone_number("수고")
                    .maxPeople(1).click_count(0).build());

            commentsRepository.save(Comments.builder().activities(activities).userID("wjddms").contents("sdskjfdskfd").build());

            actApplyRepository.save(ActApply.builder().activities(activities).userID("wjddms").email("wjddms0922@gmail.com").file("123").build());

            schedulesRepository.save(Schedules.builder().title("모바일 팀프로젝트 제출").userID("wjddms").start_date("2020-12-07").end_date("2020-12-07").color_index(1)
                    .memo("Spring Boot 뿌시기").build());

            noticeRepository.save(Notice.builder().category("업데이트").save_date("2020-12-07").contents("오늘 자로 업데이트 할거다").build());
        };
  }

}
