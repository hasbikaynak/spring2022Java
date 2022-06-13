package day16;

import java.util.ArrayList;
import java.util.List;

public class Day16Review {
    public static void main(String[] args) {
        //Create a list and add even integers between 13 and 51 in descending order.
        //Then print the 7th element on the console.

//        List<Integer> al = new ArrayList<>();
//
//        for (int i = 51; i > 12 ; i--) {
//            if (i % 2 == 0) {
//                al.add(i);
//            }
//        }
//        System.out.println(al);
//        System.out.println(al.get(6));


        //Create a String List, add elements into it, remove the elements which ends with "a" and starts with "M".
//        List<String> al = new ArrayList<>();
//
//        al.add("Mama");
//        al.add("Mandelena");
//        al.add("Karenina");
//        al.add("Mexico");
//        al.add("Casablanca");
//        al.add("Mandelena");
//
//        System.out.println(al);
//
//        for (int i = 0; i < al.size(); i++) {
//            String element = al.get(i);
//            if (element.startsWith("M") && element.endsWith("a")) {
//                al.remove(i);
//                i--;
//            }
//        }
//
//        System.out.println(al);

        //Create an Integer List, add 5 elements into it, remove the even elements, change the odds elements to 22.
//        //[12,3,7,24,11] ==> [22,22,22]

        List<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(3);
        al.add(7);
        al.add(24);
        al.add(11);

        System.out.println(al);


        for (int i = 0; i < al.size();i++) {
            if (al.get(i) %2==0) {
                al.remove(i);
                i--;
            }
            else {
                al.set(i,22);
            }
        }

        System.out.println(al);













    }
}
