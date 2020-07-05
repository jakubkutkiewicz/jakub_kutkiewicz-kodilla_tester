package com.kodilla.spring.basic;

public class SimpleApplication {

    private MessageService messageService;

    public SimpleApplication(MessageService messageService) {
        this.messageService = messageService;
    }


    public void processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            this.messageService.send(message, receiver);
        }
    }

    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}

