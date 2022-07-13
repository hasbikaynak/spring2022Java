package day26;

import java.util.HashSet;
import java.util.Set;

public class HashSet01 {
    //treeset for the sorted list.

    /*
    1) When you see the word Set in Java, it means no repeated elements, all elements are unique.
    Example: Social Numbers, email addresses...

    2) Set is interface, and it has 3 concrete child classes.
       i)HashSet
       ii)LinkedHashSet
       iii)TreeSet ==> Tree means sorted. in natural order.


       i) HashSet
       a) It is the fastest set.
       b) It does not put elements in any order. Elements will be in random order.
       c) All elements are unique in HashSet
       d) HashSet allows to use just a single null element. Null can not be repeated as well.
     */

    public static void main(String[] args) {
        Set<String> hSet = new HashSet<>();

        hSet.add("T");
        hSet.add("A");
        hSet.add("Z");
        hSet.add("M");
        hSet.add("E");
        hSet.add("N");
        hSet.add(null);

        System.out.println("First N" + hSet.add("N")); // true, means first N could add
        System.out.println("Second N" + hSet.add("N")); // false, means second N could not add

        System.out.println(hSet);
    }
}
