package com.kodilla.spring.basic;

import com.kodilla.spring.basic.spring_dependency_injection.FacebookMessageService;
import com.kodilla.spring.basic.spring_dependency_injection.MessageService;

public class SimpleApplicationRunner {
    public static void main(String[] args) {
        MessageService messageService = new FacebookMessageService();
        SimpleApplication application = new SimpleApplication(messageService);
        application.processMessage("Test message", "receiver@mail.com");
    }
}
