package homework;

public class FizzBuzzChecker {


    public String fizzCzeker(int number) {
        int F3 = number % 3;
        int F5 = number % 5;
        if (F3 == 0 & F5 == 0) {
            return "FizzBuzz";
        } else if (F3 == 0) {
            return "Fizz";
        } else if (F5 == 0) {
            return "Buzz";
        } else {
            return "Nope";
        }
    }
}

