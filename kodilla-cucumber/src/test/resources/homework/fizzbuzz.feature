Feature: FizzBuzz


   Scenario Outline: is it Fizz, Buzz or FizzBuzz?
      Given number is <number>
      When I ask whether it's Fizz or Buzz
      Then I should be told <answer>
   Examples:
        |number|answer|
	    |-2 | "Nope" |
        | 1 | "Nope"|
        | 2 | "Nope" |
        | 3 |  "Fizz" |
	    | 4 | "Nope" |
        | 5 | "Buzz" |
        | 15 | "FizzBuzz" |
    	| 90 | "FizzBuzz" |

