package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
private String nameSchool;
    private List<Double> students = new ArrayList<>();

    public School(String nameSchool, double... students) {
        this.nameSchool=nameSchool;

        for (double student : students)
            this.students.add(student);
    }


    public double getSumofStudents() {
        double sum = 0.0;
        for (double student :students)
            sum += student;
        return sum;
    }

    @Override
    public String toString() {
        return "school=" + students.toString() ;
    }
    public String getNameSchool() {
        return nameSchool;
    }
}


