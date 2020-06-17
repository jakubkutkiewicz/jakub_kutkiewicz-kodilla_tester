package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        TaskRepository.getTasks()
                .stream()
                .filter(u->u.getDeadline().isBefore(currentDate))
                .collect(Collectors.toList());
        List<Task> tasks = TaskRepository.getTasks();
        System.out.println(tasks);

    }

    public static String getTask(Task task) {
        return task.getName();
    }
}
