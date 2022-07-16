package day31;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Functional_Programming02 {
    public static void main(String[] args) {
        //1) Create a method to print all list elements in uppercase
        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Ali");
        list.add("Mark");
        list.add("Amanda");
        list.add("Christopher");
        list.add("Jackson");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Benjamin");

        printElementsInUpperCase01(list);
        System.out.println();
        //printElementsInUpperCase02(list);
        printElementsInLengthOrder(list);
        System.out.println();
        printElementsInLengthInReverseOrder(list);
        System.out.println();
        sortDistinctElementsByUsingLastChars(list);
        System.out.println();
        sortElementsLengthsAndFirstChar(list);
        System.out.println();
        //removeElementsIfLengthIsGreaterThanFive(list);
        //removeIfStartsWithAaOrNn(list);
//        removeIfLengthBetweenEightAndTenOrEndingWithO(list);
        System.out.println(checkIfLengthsOfElementsLessThanTwelve(list));
        System.out.println(checkIfInitialOfAnyElementIsNotX(list));
        System.out.println(checkIfAnyElementEndsWithr(list));
    }

    public static void printElementsInUpperCase01(List<String>list){
        list.stream().map(String::toUpperCase).forEach(Utils::putSpacesBetweenElements);
    }

    public static void printElementsInUpperCase02(List<String>list){
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }

    //2) Create a method to print the elements after ordering according to their lengths
    public static void printElementsInLengthOrder(List<String>list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::putSpacesBetweenElements);
    }

    //3) Create a method to print the elements after ordering according to their lengths (In reverse order)
    public static void printElementsInLengthInReverseOrder(List<String>list){
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::putSpacesBetweenElements);
    }

    //4) Create a method to sort the distinct elements by using their last characters
    public static void sortDistinctElementsByUsingLastChars(List<String>list){
        list.stream().distinct().sorted(Comparator.comparing(Utils::getLastChar)).forEach(Utils::putSpacesBetweenElements);
    }

    //5) Create a method to sort the elements according to their lengths then according to their first character
    public static void sortElementsLengthsAndFirstChar(List<String>list){
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0))).forEach(Utils::putSpacesBetweenElements);
    }

   // 6) Remove the elements if the length of the element is greater than 5
    public static void removeElementsIfLengthIsGreaterThanFive(List<String>list){
        list.removeIf(t->t.length()>5);
        System.out.println(list);
    }

   // 7) Remove the elements if the element is starting with ‘A’, ‘a’ or ending with ‘N’, ‘n’
    public static void removeIfStartsWithAaOrNn(List<String>list){
        list.removeIf(t->t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n"));
        System.out.println(list);
    }

   // 8) Remove the elements if the length is between 8 and 10 or ending with 'o'
    public static void removeIfLengthBetweenEightAndTenOrEndingWithO(List<String>list){
        Predicate<String> checkCondition = t->t.length() > 7 && t.length() < 11 || t.endsWith("o");
        list.removeIf(checkCondition);
        System.out.println(list);
    }

    //9) Create a method to check if the lengths of all elements are less than 12
    public static boolean checkIfLengthsOfElementsLessThanTwelve(List<String> list){
      boolean isLessThanTwelve =  list.stream().allMatch(t->t.length() < 12);
      return isLessThanTwelve;
    }

    //10) Create a method to check if the initial of any element is not ‘X’
    public static boolean checkIfInitialOfAnyElementIsNotX(List<String>list){
       boolean isNotX = list.stream().anyMatch(t->t.startsWith("X"));
       return isNotX;
    }

    //11) Create a method to check if at least one of the elements ending with “r”
    public static boolean checkIfAnyElementEndsWithr(List<String>list){
       boolean isEndWithr = list.stream().anyMatch(t->t.endsWith("r"));
       return isEndWithr;
    }

}


























