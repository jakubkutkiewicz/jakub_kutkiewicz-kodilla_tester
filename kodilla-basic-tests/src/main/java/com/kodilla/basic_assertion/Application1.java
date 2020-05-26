package com.kodilla.basic_assertion;

public class Application1 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 1;

        int sumResult = calculator.dodawanie(a, b);
        boolean correct = ResultChecker.assertEquals(11, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int minusResult = calculator.odejmowanie(a, b);
        boolean correctminus = ResultChecker.assertEquals(1, minusResult);
        if (correctminus) {
            System.out.println("metoda minusResult działa poprawnie");
        } else {
            System.out.println("metoda minusResult nie działa poprawnie");
        }

        double potega= calculator.power;
        boolean correctPotega = ResultChecker.assertEquals(1, potega);
        if (correctPotega) {
            System.out.println("jest ok ");
        } else {
            System.out.println("nie jest ok");

        }
    }
}
