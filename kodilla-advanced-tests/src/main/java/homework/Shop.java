package homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orderList = new ArrayList<>();

    //dodanie nowego zamówienia
    public void addOrder(Order order) {
        this.orderList.add(order);
    }

    //zwrócenie listy zamówień z zakresu dwóch dat,
    public List<Order> getDate(LocalDate startDate, LocalDate endDate) {
        return orderList
                .stream()
                .filter(u -> u.getDate().isAfter(startDate) && u.getDate().isBefore(endDate))
                .collect(Collectors.toList());
    }


    //najmniejsza wartość zamówienia
    public double getLowerOrderPrice() {
        return orderList
                .stream()
                .map(u -> u.getPriceOrder())
                .mapToDouble(n -> n)
                .min()
                .getAsDouble();
    }

    //najwieksza wartosc
    public double getHighestOrderPrice() {
        return orderList
                .stream()
                .map(u -> u.getPriceOrder())
                .mapToDouble(n -> n)
                .max()
                .getAsDouble();


    }

    //liczba zamowien
    public int getNumberOfOrders() {

        return orderList.size();
    }

    //suma zamowien
    public double sumOfOrders() {
        return orderList
                .stream()
                .map(i -> i.getPriceOrder())
                .mapToDouble(n -> n)
                .sum();

    }

}


