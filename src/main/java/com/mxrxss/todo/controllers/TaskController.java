package com.mxrxss.todo.controllers;

import com.mxrxss.todo.model.dto.TaskDto;
import com.mxrxss.todo.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("http://localhost:5173/")
@RequestMapping("/api")
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/task")
    public List<TaskDto> getTasks(){
        return taskService.findAll();
    }

    @GetMapping("/task/{taskId}")
    public TaskDto getTask(
            @PathVariable("taskId") long taskId
    ){
        return taskService.getById(taskId);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/task")
    public void addTask(
            @RequestBody TaskDto taskDto
    ){
        taskService.addTask(taskDto);
    }

    @PutMapping("task/{taskId}")
    public void updateTask(
            @PathVariable("taskId") long taskId,
            @RequestBody TaskDto taskDto
    ){
        taskService.updateTask(taskId, taskDto);
    }

    @DeleteMapping("task/{taskId}")
    public void deleteTask(
            @PathVariable("taskId") long taskId
    ){
        taskService.deleteTask(taskId);
    }
}
