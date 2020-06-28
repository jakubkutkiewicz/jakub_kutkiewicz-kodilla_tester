package homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    double priceOrder;
    LocalDate date;
    String login;

    @Override
    public String toString() {
        return "Order{" +
                "priceOrder=" + priceOrder +
                ", date=" + date +
                ", login='" + login + '\'' +
                '}';
    }

    public double getPriceOrder() {
        return priceOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.priceOrder, priceOrder) == 0 &&
                Objects.equals(date, order.date) &&
                Objects.equals(login, order.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceOrder, date, login);
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    public Order(double priceOrder, LocalDate date, String login) {
        this.priceOrder = priceOrder;
        this.date = date;
        this.login = login;
    }
}
