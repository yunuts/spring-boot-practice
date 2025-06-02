package com.example.todo.servce.task;

public record TaskEntity(
        Long id,
        String summary,
        String description,
        TaskStatus status
){

}

