package com.kodilla.inheritance.homework;

public class Application {

    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(2);
        kwadrat.pole();
        kwadrat.obwod();
        System.out.println("pole kwadratu" + kwadrat.pole());
        System.out.println("obwod kwadratu" + kwadrat.obwod());
        Prostokat prostokat = new Prostokat(3, 2);
        prostokat.pole();
        prostokat.obwod();
        System.out.println("pole prostokat" + prostokat.pole());
        System.out.println("obwod prostokat" + prostokat.obwod());
        Kolo kolo = new Kolo(2);
        kolo.obwod();
        kolo.pole();
        System.out.println("obwód koła:" + kolo.obwod() + "pole koła "+ kolo.pole());
    }

}
