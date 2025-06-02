package com.task.project.taskproject.entity;

import com.task.project.taskproject.enums.PriorityEnum;
import com.task.project.taskproject.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "descripiton")
    private String description;

    @Column(name = "status")
    private StatusEnum status;

    @Column(name = "priority")
    private PriorityEnum priority;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}