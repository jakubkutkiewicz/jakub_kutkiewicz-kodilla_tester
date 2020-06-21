package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTest {
    @Test
    public void findOrder1() throws OrderDoesntExistException {

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        Order order = warehouse.getOrder("1");
        boolean find1 = warehouse.orders.contains(order);

        assertTrue(find1);
    }

    @Test (expected = OrderDoesntExistException.class)
    public void findOrder2() throws OrderDoesntExistException {

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        Order order = warehouse.getOrder("0");
        boolean find1 = warehouse.orders.contains(order);

        assertFalse(find1);
    }
}