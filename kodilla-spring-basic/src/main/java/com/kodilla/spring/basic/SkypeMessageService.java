package com.kodilla.spring.basic;

public class SkypeMessageService implements MessageService {
    @Override
    public void send(String message, String receiver) {
        System.out.println("Sending [" + message + "] to: " + receiver + " using Skype");
    }
}
