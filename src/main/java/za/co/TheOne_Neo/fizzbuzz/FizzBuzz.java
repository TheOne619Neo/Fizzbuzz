package za.co.TheOne_Neo.fizzbuzz;
import java.util.*;
import java.util.ArrayList;

public class FizzBuzz {
    public String checkNumber(int number) {
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if ( divisibleBy3 && divisibleBy5 ) {
            return "FizzBuzz";
        }
        else if ( divisibleBy3) {

            return "Fizz";
        }
        else if(divisibleBy5) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public String countTo(int number) {
        List<String> sequence = new ArrayList<String>();
        FizzBuzz list = new FizzBuzz();
        for(int i = 1; i<= number; i++){
            String thing = list.checkNumber(i);
            sequence.add(thing);
        }
        return sequence.toString();
    }

//    public static void main(String[] args){
//        FizzBuzz b = new FizzBuzz();
//        System.out.println((b.checkNumber(2)));
//    }



}
