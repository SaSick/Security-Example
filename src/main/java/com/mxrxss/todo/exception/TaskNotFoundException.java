package com.mxrxss.todo.exception;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(Long id){
        super("Could not find by id" + id);
    }

}
