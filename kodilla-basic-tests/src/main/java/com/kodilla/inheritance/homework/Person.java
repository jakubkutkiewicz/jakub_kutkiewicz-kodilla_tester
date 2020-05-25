package com.kodilla.inheritance.homework;

import java.util.PrimitiveIterator;

public class Person {
    private Job job;
    private int age;
    private String name;

    public Person(Job job,int age, String name) {
        this.job = job;
        this.age = age;
        this.name = name;
    }

    public Job getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void showPersonDuty() {
        System.out.println(this.getName() + " is responsible for " + this.job.getResponsibilities());
    }

    public static void main(String[] args) {
        Person kucharz = new Person(new Kucharz(3000,"gotuje"),30,"Jan");
        kucharz.showPersonDuty();
        Person piekarz = new Person(new Piekarz( 3333,"piecze") ,34,"Janusz");
        piekarz.showPersonDuty();
    }
}

