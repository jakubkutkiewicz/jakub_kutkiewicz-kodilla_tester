package com.kodilla.optional.homework;

import com.kodilla.stream.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Janek", new Teacher("Jan Kowalski")));
        students.add(new Student("Janek", new Teacher(null)));
        students.add(new Student("Janek", new Teacher(null)));

        for (Student student : students)
            System.out.println(
                    Optional.ofNullable(student.getTeacher()).map(u -> u.getName()).orElse("<undefined>"));
    }
}

