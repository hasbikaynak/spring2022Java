package homeworks;

import java.lang.reflect.Array;
import java.util.*;

public class ListsHomework {
    public static void main(String[] args) {
////        Find the sum of all list elements in an integer list
//        List<Integer> list = Arrays.asList(12,31,7,13,10);
//
//        int sum=0;
//        for (Integer w: list) {
//            sum+= w;
//        }
//        System.out.println(sum);

//        Find the sum of all list elements before the first occurrence of 13 in an integer list
//          List<Integer> list = Arrays.asList(12,31,7,13,10);
//
//          String sum="";
//        for (Integer w: list) {
//            if (w == 13) {
//                break;
//            }
//            sum+= w + " ";
//        }
//        System.out.println(sum);

//        Find the multiplication of all even list elements in an integer list
//          List<Integer> list = Arrays.asList(12,31,7,13,10);
//
//          int sum = 1;
//        for (Integer w:list) {
//            if (w %2 == 0) {
//                sum*=w;
//            }
//        }
//        System.out.println(sum);

//        Check if elements are in descending order in a list
//Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
// (Yellow, Red, Green, Blue) ==> Output: It is in descending order

//        List<String> list = Arrays.asList("Yellow","Red","Green","Blue");
//        System.out.println(list); //[Yellow, Red, Green, Blue]
//
//        List<String> secondList = new ArrayList<>();
//        secondList.addAll(list);
//        Collections.sort(secondList);
//        System.out.println(secondList); //[Blue, Green, Red, Yellow]
//
//        int size = list.size();
//        int flag = 0;
//        for (int i = 0; i < size; i++) {
//            if (secondList.get(i).equals(list.get(size-1))) {
//                flag++;
//            }
//        }
//        if (flag == size) {
//            System.out.println("It is in descending order");
//        }
//        else {
//            System.out.println("It is not in descending order");
//        }

//        If the list has 15 as element, change all 15s to 51
//Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)

//        List<Integer> list = Arrays.asList(12,11,15,34,43);
//
//
//        int flag = 0;
//        for (Integer w:list) {
//          int indexOf =  list.indexOf(w);
//            if (w == 15) {
//                list.set(indexOf,51);
//                flag++;
//            }
//        }
//        if (flag == 0) {
//            System.out.println("There is no element that has value of 15");
//        }
//        else {
//            System.out.println(list);
//        }

//        If a list has 15 or 13, remove them.
//Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(31);
//        list.add(14);
//        list.add(12);
//        list.add(54);
//        list.add(11);
//
//        int flag = 0;
//        for (int i = 0; i < list.size(); i++) {
//
//            if (list.get(i) == 15) {
//                int idx15 = list.indexOf(15);
//                list.remove(idx15);
//                i--;
//                flag++;
//            }
//            if (list.get(i) == 13) {
//                int idx13 = list.indexOf(13);
//                list.remove(idx13);
//                i--;
//                flag++;
//            }
//        }
//
//        if (flag == 0) {
//            System.out.println("List does not contain either number of 15 or 13");
//        }
//        else {
//            System.out.println(list);
//        }

//        Find the closest 2 integers in an Integer List
//Example: (12, 31, 15, 13, 54) ==> Output is 12 and 13


//        List<Integer> list = Arrays.asList(12,31,14,13,54);
//
//        Collections.sort(list); // 12,13,14,31,54
//
//        int minDiff = list.get(1) - list.get(0); //1
//
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i+1; j < list.size() ; j++) {
//                if (list.get(j) - list.get(i) <= minDiff) {
//                    System.out.println(list.get(i) + "-" + list.get(j));
//                }
//            }
//        }

//        Increase the value of every element except 7 and 10 by 2 in a List
//Example: (12, 31, 7, 13, 10) ==> Output is (14, 33, 7, 15, 10)

        //List<Integer> list = Arrays.asList(12,31,7,13,10);
//        List<Integer> list1 = new ArrayList<>();
//
//
//        for (int i=0;i < list.size();i++) {
//            int element = list.get(i);
//            if (element == 7 || element == 10) {
//                list1.add(element);
//            }
//            else {
//                list1.add(element+2);
//            }
//        }
//        System.out.println(list1);
// II. way
//        for (Integer w:list) {
//            if (w == 7 || w == 10) {
//                continue;
//            }
//            else {
//                list.set(list.indexOf(w), w+2);
//            }
//        }
//        System.out.println(list);

//        Find the sum of all prices given in a String list
//Example: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04

//        List<String> myList =Arrays.asList("$12.99", "$23.60", "$54.45");
//        double sum=0;
//
//        for (String w:myList) {
//            Double price = Double.valueOf(w.replace("$",""));
//            sum+=price;
//        }
//        System.out.println(sum);

//        Find the sum of the least and the greatest price given in a String list
//Example: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70


        //sort
        //get first element
        //get last element
        //sum of them

//        List<String> list = Arrays.asList("$12.99", "$8.25", "$23.60", "$54.45");
//        List<Double> listDouble = new ArrayList<>();
//
//        for (String w:list) {
//            Double price = Double.valueOf(w.replace("$",""));
//            listDouble.add(price);
//        }
//
//        System.out.println(listDouble);
//
//        Collections.sort(listDouble);
//
//        Double firstElement = listDouble.get(0);
//        Double lastElement = listDouble.get(list.size()-1);
//        Double  sum = firstElement + lastElement;
//
//
//        System.out.println(sum);


//                  Check if all elements are unique in an integer List by using loops.
//          List<Integer> myList = new ArrayList<>();
//          myList.add(10);
//          myList.add(31);
//          myList.add(15);
//          myList.add(7);
//          myList.add(15);
//          myList.add(23);
//        List<Integer> myList = Arrays.asList(10,31,15,7,15,23);
//        int flag = 0;
//        for (int i = 0; i < myList.size(); i++) {
//            for (int j = i+1; j < myList.size(); j++) {
//                if (myList.get(i).equals(myList.get(j))) {
//                    flag++;
//                }
//            }
//        }
//
//       String returnValue = (flag > 0) ? "All elements are not unique": "All elements are unique";
//
//        System.out.println(returnValue);

//        Mountain Array ==> [0, 2, 5, 3, 1] It is constantly increasing to the maximum value,
//decreasing constantly after the maximum value
//Not Mountain Array ==> [5, 2, 7, 1, 4] It is decreasing then increasing to the maximum value,
//decreasing and increasing after the maximum value
//Type a code to check if any given array is Mountain Array or not.



        //get the max value into int container
        //check if the second element is greater than first element and so on...
        //check if 2 after the max value element is less than next element right after the max value and so on...

        int a[] = { 0, 2, 5, 3, 1 };
        List<Integer> list = new ArrayList<>();

        Arrays.stream(a).forEach(t -> list.add(t));

        int max = list.stream().reduce(Integer.MIN_VALUE, Integer::max);

        int idxOfMax = list.indexOf(max);

        List<Integer> part1 = new ArrayList<>();
        list.stream().filter(t -> list.indexOf(t) <= idxOfMax).forEach(t -> part1.add(t));
        List<Integer> sortedPart1 = new ArrayList<>();

        part1.stream().forEach(t -> sortedPart1.add(t));
        Collections.sort(sortedPart1);

        List<Integer> part2 = new ArrayList<>();
        list.stream().filter(t -> list.indexOf(t) >= idxOfMax).forEach(t -> part2.add(t));

        List<Integer> reverseSortedPart2 = new ArrayList<>();
        part2.stream().forEach(t -> reverseSortedPart2.add(t));

        Collections.sort(reverseSortedPart2);
        Collections.reverse(reverseSortedPart2);

        if (part1.equals(sortedPart1) && part2.equals(reverseSortedPart2)) {
        } else {
        }
















    }
}
