package com.example.supersprinter3000.entity;


import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter

public class Task {
    private Long id;
    private String title;
    private String description;
    private Double estimationTime;
}
