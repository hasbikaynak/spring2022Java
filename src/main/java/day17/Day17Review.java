package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day17Review {
    public static void main(String[] args) {
//        // Find the closest 2 integers in the given list.
//        //[12,15,10,11,20] ==> 12-11, 10,11
//        List<Integer> list = Arrays.asList(12,15,10,11,20);
//        Collections.sort(list); // [10,11,12,15,20]
//
//        // Sort the elements
//        Collections.sort(list);
//        //Select a minDiff value
//        int minDiff = list.get(1) - list.get(0);
//        //Create a loop to compare all differences
//        for (int i = 2; i < list.size(); i++) {
//            minDiff = Math.min(minDiff ,list.get(i)- list.get(i-1));
//        }
//        System.out.println(minDiff);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i)- list.get(i-1) == minDiff) {
//                System.out.println(list.get(i) + " " + list.get(i-1));
//            }
//        }

        //From a given list find all pairs whose sum is a given number
//      {4, 6, 5, -10, 8, 5, 20} ==> 10
//      For example;  4+6=10, 5+5=10, -10+20=10

//        List<Integer> list = Arrays.asList(4,6,5,-10,8,5,20);
//        int givenNum = 10;
//
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i+1; j < list.size() ; j++) {
//                if (list.get(i)+ list.get(j) == givenNum) {
//                    System.out.println(list.get(i) + "+" + list.get(j) +"="+givenNum);
//                }
//            }
//        }

        //Count the words in a String one by one
        //      String is "Ali came to school, and Ayse came to school."
        //      Ali=1, came=2, to=2, school=2, and=1, Ayse=1

//        String s = "Ali came to school, and Ayse came to school.";
//
//        String sWithoutPunct = s.replaceAll("\\p{Punct}","");
//
//        String arr[] = sWithoutPunct.split(" ");
//
//        List<String> list = new ArrayList<>();
//
//        for (String w:arr
//             ) {
//            list.add(w);
//        }
//
//        System.out.println(Arrays.toString(arr));//[Ali, came, to, school, and, Ayse, came, to, school]
//
//        String word = "";
//
//        int counter = 1;
//
//        for (int i=0; i < list.size(); i++){
//            word = arr[i];
//            for (int j = i+1; j < list.size(); j++) {
//                if (word.equals(list.get(j))) {
//                    counter++;
//                    System.out.println(word + "=" + counter);
//                     list.remove(j);
//                }
//            }
//            if(counter == 1) {
//                System.out.println(word + "=" +counter);
//            }
//            counter=1;
//        }























    }
}
