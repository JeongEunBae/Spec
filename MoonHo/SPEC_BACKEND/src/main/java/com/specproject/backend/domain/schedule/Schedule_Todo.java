package com.specproject.backend.domain.schedule;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CollectionId;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Schedule_Todo {
    @Id // Primary KEY 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TODOLIST_ID")
    private Long todolist_ID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SCHEDULE_ID") // Foreign KEY 지정
    private Schedule schedule_ID;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "TODO_CONTENT")
    private String todo_content;

    @Column(name = "COLOR_INDEX", columnDefinition = "INT")
    private int color_index;


    @Builder
    private Schedule_Todo(Long tolist_ID, Schedule schedule_ID, String category, String todo_content, int color_index){
        this.todolist_ID = tolist_ID;
        this.schedule_ID = schedule_ID;
        this.category = category;
        this.todo_content = todo_content;
        this.color_index = color_index;
    }
}
