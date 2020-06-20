package com.kodilla.exception.homework;

import javax.print.attribute.standard.OrientationRequested;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);

    }

    Order getOrder(String number) throws OrderDoesntExistException {
        Order order = orders.stream()
                .filter(u -> u.toString().contains(number))
                .findAny().orElseThrow(OrderDoesntExistException::new);
        return order;
    }
}

