package com.kodilla.spring.basic;

public class SimpleApplicationRunner {
    public static void main(String[] args) {
        MessageService messageService = new FacebookMessageService();
        SimpleApplication application = new SimpleApplication(messageService);
        application.processMessage("Test message", "receiver@mail.com");
    }
}