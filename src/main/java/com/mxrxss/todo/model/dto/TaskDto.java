package com.mxrxss.todo.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskDto {
    private Long taskId;
    private String title;
    private LocalDateTime createdAt;
}
