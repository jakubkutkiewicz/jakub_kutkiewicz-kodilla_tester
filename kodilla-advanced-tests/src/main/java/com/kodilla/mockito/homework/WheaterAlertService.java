package com.kodilla.mockito.homework;

import java.util.*;

public class WheaterAlertService {


    private Map<String, List<Person>> persons = new HashMap<>();

    public void addSubscriber(String position, Person person) {
        if (persons.containsKey(position)) {
            persons.get(position).add(person);
        } else {
            List<Person> personList = new ArrayList<>();
            personList.add(person);
            persons.put(position, personList);

        }
    }

    public void removeSubscriber(String position, Person person) {
        if (persons.containsKey(position)) {
            persons.get(position).remove(person);
        }
    }

    public void removeAllSubscribers(Person person) {
        for(List<Person> listOfPersons : persons.values()) {
            listOfPersons.remove(person);
    }
}

    public void sendNotification(Notification notification, String location) {
        if (persons.containsKey(location)) {
            persons.get(location).forEach(person -> person.receive(notification));
        }
    }

    public void sendNotificationToAll(Notification notification) {
        persons.values()
                .stream()
                .flatMap(toAll -> toAll.stream())
                .forEach(person -> person.receive(notification));

    }

    public void removePosition(String position) {
        persons.remove(position);

    }


}

