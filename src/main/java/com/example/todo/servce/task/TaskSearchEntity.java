package com.example.todo.servce.task;

import java.util.List;

public record TaskSearchEntity(
        String summary,
        List<TaskStatus> status
) {
}
