package com.kodilla.stream;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsersManager {
    public static void main(String[] args) {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getGroup().equals("chemist"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        System.out.println(usernames);
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
