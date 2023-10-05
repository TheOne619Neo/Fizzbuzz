package za.co.TheOne_Neo_tests.fizzbuzz;

import org.junit.jupiter.api.Test;

import za.co.TheOne_Neo.fizzbuzz.FizzBuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void notDivisibleBy3or5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.checkNumber(13);
        assertEquals("13", result);
    }

    @Test
    public void divisibleBy3() {
        // Insert your test code here
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.checkNumber(6);
        assertEquals("Fizz", result);

    }

    @Test
    public void divisibleBy5() {
        // Insert your test code here
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.checkNumber(10);
        assertEquals("Buzz", result);
    }

    @Test void divisibleBy3And5() {
        // Insert your test code here
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.checkNumber(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void generateUpTo15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countTo(15);
        assertEquals("[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]", result);
    }
}
