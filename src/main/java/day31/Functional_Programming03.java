package day31;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Functional_Programming03 {
    public static void main(String[] args) {
        System.out.println(sumOfNumbersSevenToHundred());
        System.out.println(sumOfNumbersSevenToHundred01());
        System.out.println(multiplicationTwoToEleven());
        System.out.println(calculateFactorial(2));
        System.out.println(sumOfNumbersBetweenTwoIntegers(5,2));
        System.out.println(sumOfDigitsOfEveryNumbersBetweenTwoIntegers(23,32));
    }
    //1)Create a method to find the sum of integers from 7 to 100
    public static int sumOfNumbersSevenToHundred(){
        return IntStream.range(7,101).sum();
    }

    public static int sumOfNumbersSevenToHundred01(){
      return  IntStream.rangeClosed(7,100).reduce(0,Math::addExact);
    }

    //2)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
    public static int multiplicationTwoToEleven(){
        return IntStream.rangeClosed(2,11).reduce(1,Math::multiplyExact);
    }
    //3)Create a method to calculate the factorial of a given number.(5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
    public static long calculateFactorial(int x){
        if (x < 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException(e+ "\tDo not use negative numbers");
            }
        }
        return LongStream.rangeClosed(1,x).reduce(1,Math::multiplyExact);
    }
    //4)Create a method to calculate the sum of even integers between given two integers
    public static int sumOfNumbersBetweenTwoIntegers(int start, int last){
        int x=0;
        if (start>last){
            x = start;
            start = last;
            last = x;
        }
    return  IntStream.rangeClosed(start,last).filter(Utils::isEvenNumbers).sum();
    }
    //5)Create a method to calculate the sum of digits of every integers between given two integers
    //  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68
    public static int sumOfDigitsOfEveryNumbersBetweenTwoIntegers(int first, int second){
        int x = 0;
        if (first>second){
            x=first;
            first=second;
            second=x;
        }
     return IntStream.rangeClosed(first,second).map(Utils::sumOfNumbersBetweenTwoIntegers).sum();
    }


}
