package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;


public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);

    }

    Order getOrder(String number) throws OrderDoesntExistException {
        Order order = orders.stream()
                .filter(u -> u.getNumber().contains(number))
                .findAny().orElseThrow(OrderDoesntExistException::new);
        return order;
    }
}

