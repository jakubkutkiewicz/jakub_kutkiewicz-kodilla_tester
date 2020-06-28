package homework;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {

    Shop shop = new Shop();
    Order order1 = new Order(20, LocalDate.of(2020, 06, 21), "Adam");
    Order order2 = new Order(30, LocalDate.of(2020, 06, 22), "Ada");
    Order order3 = new Order(40, LocalDate.of(2020, 06, 23), "Andrzej");

    @BeforeEach
    public void addSources() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @Test
    public void testAddOrder() {
        int numberOfOrders = shop.getNumberOfOrders();
        System.out.println(numberOfOrders);
    }

    @Test
    public void testDateOrder() {
        int dates = shop.getDate(
                LocalDate.of(2020, 06, 10),
                LocalDate.of(2020, 06, 30))
                .size();

        assertEquals(3, dates);
        System.out.println();
    }//jak wyswietlic zamównienia z tego zakresu dat ?


    @Test
    public void lowerOrder() {
        double lowerOrderPrice = shop.getLowerOrderPrice();
        assertEquals(20, lowerOrderPrice);
        System.out.println(lowerOrderPrice);
    }

    @Test
    public void higherOrder() {
        double orderPrice = shop.getHighestOrderPrice();
        assertEquals(40, orderPrice);
        System.out.println(orderPrice);
    }

    @Test
    public void sumOfOrders() {
        double sumOfOrders = shop.sumOfOrders();
        assertEquals(90, sumOfOrders);
        System.out.println(sumOfOrders);
    }

}




