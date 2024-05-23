package com.mxrxss.todo.service;

import com.mxrxss.todo.model.dto.TaskDto;

import java.util.List;

public interface TaskService {


    List<TaskDto> findAll();

    TaskDto getById(long taskId);

    void addTask(TaskDto task);

    void updateTask(long taskId, TaskDto taskDto);

    void deleteTask(long taskId);
}
