package day31;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Functional_Programming01 {
    /*
    1) Variable or variables or zero variable -> logic(lambda)
    The structure is called Lambda Expression
    2) In functional programming we can use lambda expression, it is allowed but not recommended.
     Instead of Lambda Expression, we prefer to use Method reference.
    3) Method reference is Class name::method name
     For example: String :: length(Do not type method parenthesis, type just method name)
     Arrays :: toString
     You can use your own class and methods as well. For example, you created Animal class and, you have eat() in Animal class
     Animal::eat
     */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Utils utils = new Utils();
        list.add(8);
        list.add(9);
        list.add(131);
        list.add(10);
        list.add(9);
        list.add(10);
        list.add(2);
        list.add(8);

        printElementsFunctional(list);
        System.out.println();
        printEvenElements(list);
        System.out.println();
        printSquareOfOddElements(list);
        System.out.println();
        printCubeOfDistinctOddElements(list);
        System.out.println();
        printSumOfSquaresOfDistinctEvenElements(list);
        printCubesOfDistinctOfEvenProducts(list);
        findMaxValue01(list);
        findMinEvenValueGreaterThanSeven01(list);
        findHalfOfEachElementThatAreDistinctAndGreaterThanFiveInReverseOrder(list);
    }


    //1)Create a method to print the list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional with method reference)
    public static void printElementsFunctional(List<Integer> list){
        list.stream().forEach(Utils::putSpacesBetweenElements);
    }

    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional with method reference)
    public static void printEvenElements(List<Integer>list){
        list.stream().filter(Utils::isEvenNumbers).forEach(Utils::putSpacesBetweenElements);
    }

    //3)Create a method to print the square of odd list elements on the console in the same line with a
    //  space between two consecutive elements.(Functional with method references)
    public static void printSquareOfOddElements(List<Integer>list){
        list.stream().filter(Utils::isOddNumbers).map(Utils::getSquareOfNumbers).forEach(Utils::putSpacesBetweenElements);
    }
    //4)Create a method to print the cube of distinct odd list elements on the console in the same line
    //  with a space between two consecutive elements.
    public static void printCubeOfDistinctOddElements(List<Integer>list){
        list.stream().distinct().filter(Utils::isOddNumbers).map(Utils::getCubeOfNumbers).forEach(Utils::putSpacesBetweenElements);
    }

    //5)Create a method to calculate the sum of the squares of distinct even elements
    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer>list){
      Integer result =  list.stream().distinct().filter(Utils::isEvenNumbers).map(Utils::getSquareOfNumbers).reduce(0, Math::addExact);
      System.out.println(result);
    }

    //6)Create a method to calculate the product of the cubes of distinct even elements
    public static void printCubesOfDistinctOfEvenProducts(List<Integer>list){
        Integer result = list.stream().distinct().filter(Utils::isEvenNumbers).map(Utils::getCubeOfNumbers).reduce(1,Math::multiplyExact);
        System.out.println(result);
    }

    //7)Create a method to find the maximum value from the list elements
    public static void findMaxValue01(List<Integer>list){
       Integer result = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,Math::max);
        System.out.println(result);
    }

    //9)Create a method to find the minimum value which is greater than 7 and even from the list
    public static void findMinEvenValueGreaterThanSeven01(List<Integer>list){
        Integer result = list.stream().distinct().filter(t->t>7).filter(Utils::isEvenNumbers).reduce(Integer.MAX_VALUE,Math::min);
        System.out.println(result);
    }

    public static void findHalfOfEachElementThatAreDistinctAndGreaterThanFiveInReverseOrder(List<Integer>list){
        List<Double> result = list.stream().distinct().filter(t->t>5).map(Utils::findHalfOfNum).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result);
    }






























}
