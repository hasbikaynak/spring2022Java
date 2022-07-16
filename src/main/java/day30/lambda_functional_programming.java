package day30;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class lambda_functional_programming {
    /*
    Lambda is functional programming, we started to use lambda in Java 8
    In functional programming we focus on what to do, but in structured programming we focus on how to do
    functional programming can be used just with arrays and collections.
    by using entrySet() you can convert Map to Set,then you can use functional programming in Maps as well.
     */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(131);
        list.add(10);
        list.add(9);
        list.add(10);
        list.add(2);
        list.add(8);
        printElementsStructured(list);
        System.out.println();
        printElementsFunctional(list);
        System.out.println();
        printEvenElementsStructured(list);
        System.out.println();
        printEvenElementsFunctional(list);
        System.out.println();
        printSquareOfOddElementsFunctional(list);
        System.out.println();
        printCubeOfOddElementsFunctional(list);
        System.out.println();
        printSumOfSquaresOfDistinctEvenElements(list);
        printCubesOfDistinctOfEvenProducts(list);
        findMaxValue01(list);
        findMaxValue02(list);
        findMinEvenValueGreaterThanSeven01(list);
        findMinEvenValueGreaterThanSeven02(list);
        findMinEvenValueGreaterThanSeven03(list);
        findHalfOfEachElementThatAreDistinctAndGreaterThanFiveInReverseOrder(list);

    }
        //1)Create a method to print the list elements on the console in the same line with a space
        //  between two consecutive elements.(Structured)
    public static void printElementsStructured(List<Integer>list){
        for (Integer w:list) {
            System.out.print(w+" ");
        }
    }

    //1)Create a method to print the list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional)
    public static void printElementsFunctional(List<Integer>list){
        list.stream().forEach(t-> System.out.print(t+" "));
    }

    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Structured)
    public static void printEvenElementsStructured(List<Integer>list){
        for(Integer w: list){
            if (w %2 == 0){
                System.out.print(w + " ");
            }
        }
    }

    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional)
    public static void printEvenElementsFunctional(List<Integer>list){
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" ")); // filter() ==> Returns a stream consisting of the elements of this stream that match the given predicate
    }

    //3)Create a method to print the square of odd list elements on the console in the same line with a
    //  space between two consecutive elements.(Functional)
    public static void printSquareOfOddElementsFunctional(List<Integer>list){
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" ")); //map() => Returns a stream consisting of the results of applying the given function to the elements of this stream
    }

    //4)Create a method to print the cube of distinct odd list elements on the console in the same line
    //  with a space between two consecutive elements.
    public static void printCubeOfOddElementsFunctional(List<Integer>list){
        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" ")); // distinct() ==> Returns a stream consisting of the distinct elements (according to Object.equals(Object))
        // of this stream.
       // For ordered streams, the selection of distinct elements is stable (for duplicated elements, the element appearing first in the encounter order is preserved.) For unordered streams, no stability guarantees are made
    }

    //5)Create a method to calculate the sum of the squares of distinct even elements
    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer>list){
       Integer sumOfSquaresOfDistinctEvenElements = list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, (t,u)->t+u); // reduce() ==> Sum,Multiplication,Max, Min, Avg...
        System.out.println(sumOfSquaresOfDistinctEvenElements);
    }

    //6)Create a method to calculate the product of the cubes of distinct even elements
    public static void printCubesOfDistinctOfEvenProducts(List<Integer>list){
       Integer cubesOfDistinctOfCubesOfEvenProducts = list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.println(cubesOfDistinctOfCubesOfEvenProducts);
    }

    //7)Create a method to find the maximum value from the list elements
    public static void findMaxValue01(List<Integer>list){
        Integer maxValue = list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t : u);
        System.out.println(maxValue);
    }
    public static void findMaxValue02(List<Integer>list){
        Integer maxValue = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
        System.out.println(maxValue);
    }

    //9)Create a method to find the minimum value which is greater than 7 and even from the list
    public static void findMinEvenValueGreaterThanSeven01(List<Integer>list){
       Integer minEvenValue = list.stream().distinct().filter(t->t>7).filter(t->t%2==0).reduce(Integer.MAX_VALUE,(t,u)->t>u ? u:t);
        System.out.println(minEvenValue);
    }
    public static void findMinEvenValueGreaterThanSeven02(List<Integer>list){
        Integer minEvenValue = list.
                               stream().
                               distinct().
                               filter(t->t>7).
                               filter(t->t%2==0).
                               sorted(Comparator.reverseOrder()).
                               reduce(Integer.MAX_VALUE,(t, u)->u);

        System.out.println(minEvenValue);
    }
    public static void findMinEvenValueGreaterThanSeven03(List<Integer>list){
        Integer minEvenValue = list.stream().distinct().filter(t->t>7).filter(t->t%2==0).sorted().findFirst().get();

        System.out.println(minEvenValue);
    }

    //10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
    public static void findHalfOfEachElementThatAreDistinctAndGreaterThanFiveInReverseOrder(List<Integer>list){
      List<Double> result = list.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result);
    }
}
















