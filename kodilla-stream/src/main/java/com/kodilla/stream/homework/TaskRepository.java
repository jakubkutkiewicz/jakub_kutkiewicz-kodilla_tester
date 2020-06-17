package com.kodilla.stream.homework;

import java.time.Clock;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("get cat food", LocalDate.now(), LocalDate.of(2020, 06, 19)));
        tasks.add(new Task("write a report", LocalDate.now(), LocalDate.of(2020, 06, 20)));
        tasks.add(new Task("call Anie", LocalDate.now(), LocalDate.of(2020, 06, 18)));
        return tasks;
    }
}
