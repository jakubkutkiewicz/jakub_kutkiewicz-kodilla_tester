package com.kodilla.optional.homework;

import java.util.Objects;

public class Teacher {
    String name;

    public String getName() {
        return name;
    }

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return name.equals(teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
