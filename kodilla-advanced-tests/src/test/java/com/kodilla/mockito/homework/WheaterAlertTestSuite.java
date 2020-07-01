package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WheaterAlertTestSuite {

    @Test
    public void subscribedPersonShouldReceiveNotificationFromPosition() {
        WheaterAlertService wheaterAlertService = new WheaterAlertService();
        Person person = Mockito.mock(Person.class);
        Position postion = Mockito.mock(Position.class);
        Notification notification = Mockito.mock(Notification.class);

        wheaterAlertService.addSubscriber("Warszawa", person);
        wheaterAlertService.sendNotification(notification, "Warszawa");

        Mockito.verify(person, Mockito.times(1)).receive(notification);
    }

    @Test
    public void canRemoveNotificationFromPosition() {
        WheaterAlertService wheaterAlertService = new WheaterAlertService();
        Person person = Mockito.mock(Person.class);
        Position postion = Mockito.mock(Position.class);
        Notification notification = Mockito.mock(Notification.class);


        wheaterAlertService.addSubscriber("Warszawa", person);

        wheaterAlertService.removeSubscriber("Warszawa", person);
        wheaterAlertService.sendNotification(notification, "Warszawa");

        Mockito.verify(person, Mockito.never()).receive(notification);
    }

    @Test
    public void removeNotificationFromAllPositions() {
        WheaterAlertService wheaterAlertService = new WheaterAlertService();
        Person person = Mockito.mock(Person.class);

        Notification notification = Mockito.mock(Notification.class);

        wheaterAlertService.sendNotification(notification, "Katowice");
        wheaterAlertService.addSubscriber("Katowice", person);

        wheaterAlertService.removeAllSubscribers(person);
        Mockito.verify(person, Mockito.never()).receive(notification);
    }

    @Test
    public void sentNotificationToPosition() {
        WheaterAlertService wheaterAlertService = new WheaterAlertService();
        Person person1 = Mockito.mock(Person.class);
        Person person2 = Mockito.mock(Person.class);

        Notification notification = Mockito.mock(Notification.class);
        wheaterAlertService.sendNotification(notification, "Katowice");

        wheaterAlertService.addSubscriber("Katowice", person1);
        wheaterAlertService.addSubscriber("Katowice", person2);

        wheaterAlertService.sendNotification(notification, "Katowice");
        Mockito.verify(person1, Mockito.times(1)).receive(notification);
        Mockito.verify(person2, Mockito.times(1)).receive(notification);


    }

    @Test
    public void sentNotificationToAll() {

        WheaterAlertService wheaterAlertService = new WheaterAlertService();
        Person person1 = Mockito.mock(Person.class);
        Person person2 = Mockito.mock(Person.class);
        Person person3 = Mockito.mock(Person.class);

        Notification notification = Mockito.mock(Notification.class);


        wheaterAlertService.addSubscriber("Katowice", person1);
        wheaterAlertService.addSubscriber("Warszawa", person2);
        wheaterAlertService.addSubscriber("Katowice", person3);

        wheaterAlertService.sendNotificationToAll(notification);


    }

    @Test
    public void deletePosition() {
        WheaterAlertService wheaterAlertService = new WheaterAlertService();
        Person person1 = Mockito.mock(Person.class);
        Person person2 = Mockito.mock(Person.class);
        Person person3 = Mockito.mock(Person.class);

        Notification notification = Mockito.mock(Notification.class);


        wheaterAlertService.addSubscriber("Katowice", person1);
        wheaterAlertService.addSubscriber("Warszawa", person2);
        wheaterAlertService.addSubscriber("Katowice", person3);


        wheaterAlertService.removePosition("Katowice");
        Mockito.verify(person1, Mockito.never()).receive(notification);
        Mockito.verify(person3, Mockito.never()).receive(notification);

    }
}

