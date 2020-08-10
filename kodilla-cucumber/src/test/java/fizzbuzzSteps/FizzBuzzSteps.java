package fizzbuzzSteps;

import homework.FizzBuzzChecker;
import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {
    private int number;
    private String answer;

    public FizzBuzzSteps() {

        Given("number is -2", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = -2;
        });
        Given("number is 1", () -> {
            this.number = 1;
        });
        Given("number is 2", () -> {
            this.number = 2;
        });

        Given("number is 3", () -> {
            this.number = 3;
        });
        Given("number is 4", () -> {
            this.number = 4;
        });
        Given("number is 5", () -> {
            this.number = 5;
        });
        Given("number is 15", () -> {
            this.number = 15;
        });
        Given("number is 90", () -> {
            this.number = 90;
        });


        When("I ask whether it's Fizz or Buzz", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.answer = fizzBuzzChecker.fizzCzeker(this.number);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });


    }
}