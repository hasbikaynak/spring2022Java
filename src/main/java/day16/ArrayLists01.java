package day16;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        /*  Differences between Array and ArrayList
        * Arrays are fixed in length which is not good but Lists are flexible about the length which is good.
        * Arrays can store just primitives and references but Lists can store non-primitives.
        * Arrays is faster than Lists.
        * Arrays use less memory than Lists.
        * */



        //How to create a ArrayList

//        List<Integer> al = new ArrayList<>(); //Integer variable ArrayList. This is more general usage. Mostly used.
//
//        ArrayList<Integer> bl = new ArrayList<>(); // This is more specific usage.
//
//        //How to print a list on the console.
//
//        System.out.println(al); // sout method accepts the List name. output: []
//
//
//        // How to add elements into a List
//
//        al.add(12); // [12]
//        al.add(5);  //[12, 5] insertion order is playing key role here!!!
//
//        al.add(2,99); // on index 2 add element of 99
//
//        al.add(55);
//
//        System.out.println(al);
//
//
//        //How to get the number of elements in a list
//
//        int numOfEl = al.size();
//        System.out.println(numOfEl);
//
//
//        //How to get a specific element from a list by using index
//
//        int el= al.get(3);
//        System.out.println(el);

        //Create a list and add even integers between 13 and 51 in descending order.
        //Then print the 7th element on the console.


//        List<Integer> al = new ArrayList<>();
//
//        for (int i = 51; i > 12 ; i--) {
//            if (i %2 == 0) {
//                al.add(i);
//            }
//        }
//        System.out.println(al.get(6));


        //How to remove a specific element
//        List<String> al = new ArrayList<>();
//        al.add("A");
//        al.add("B");
//        al.add("C");
//        al.add("C");
//        al.add("C");
//        al.add("D");
//
//        System.out.println(al);
//
//        al.remove("C"); //if array has the repeated elements, remove method removes just the first one.
//
//        System.out.println(al);


//        List<Integer> al = new ArrayList<>();
//
//
//        al.add(12);
//        al.add(21);
//        al.add(32);
//        al.add(45);
//
//
//        al.remove(al.indexOf(21)); // 21 index is 1 so indexOf method will get the index and put into the remove. Eventually element will be removed
//
//        al.remove((Integer)32); // This is the second way to remove an element from the list.
//        System.out.println(al);

        //Create a String List, add elements into it, remove the elements which ends with "a" and starts with "M".
//        List<String> al = new ArrayList<>();
//
//        al.add("Mama");
//        al.add("Mandelena");
//        al.add("Karenina");
//        al.add("Mexico");
//        al.add("Casablanca");
//
//        for (int i=0; i < al.size(); i++) {
//            String element = al.get(i);
//
//            if (element.startsWith("M") && element.endsWith("a")) {
//                al.remove(element);
//                i--;
//            }
//        }
//        System.out.println(al);
























    }
}
