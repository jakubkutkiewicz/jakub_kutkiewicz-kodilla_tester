package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgmore40 = UsersRepository.getUsersList()
                .stream()
                .filter(y -> y.getAge() >= 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avgmore40);


        double avglow40 = UsersRepository.getUsersList()
                .stream()
                .filter(y -> y.getAge() <= 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .max()
                .getAsInt();
        System.out.println(avglow40);
    }
}