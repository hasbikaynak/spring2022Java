package day26;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    /*
       1) LinkedHastSet puts the elements in insertion order.
     */

    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("V");
        linkedHashSet.add("U");
        linkedHashSet.add("C");
        linkedHashSet.add("D");
        linkedHashSet.add(null);
        
        System.out.println(linkedHashSet);
    }
}
