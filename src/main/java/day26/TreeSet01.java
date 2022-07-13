package day26;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    /*
      1) TreeSet is for storing unique elements in natural order.
      2) TreeSet very slow because of that we don`t want to do adding, and removing operations with TreeSet.
     */
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Orange");
        treeSet.add("Palm");
        treeSet.add("Apricot");
        treeSet.add("Palm");
        //treeSet.add(null); //TreeSet does not accept null as an element.

        System.out.println(treeSet); // [Apple, Apricot, Mango, Orange, Palm]

        SortedSet<String> sub1 = treeSet.subSet("Apricot","Orange"); // [Apricot, Mango] // second value is exclusive
        System.out.println(sub1);

        NavigableSet<String> sub2 = treeSet.subSet("Apricot", false,"Palm", true); // first one inclusive? false, second one inclusive? true.
        System.out.println(sub2);

        String ceil1 = treeSet.ceiling("Nancy"); // ceiling() returns the after the given element if the element does not exist.
        System.out.println(ceil1);

        String ceil2 = treeSet.ceiling("Mango"); // ceiling() returns the after the given element if the element does not exist.
        System.out.println(ceil2);

        String ceil3 = treeSet.ceiling("Man"); // ceiling() returns the after the given element if the element does not exist.
        System.out.println(ceil3);

        String floor1 = treeSet.floor("Nancy"); // ceiling() returns the before the given element if the element does not exist.
        System.out.println(floor1);

        String floor2 = treeSet.floor("Mango"); // ceiling() returns the before the given element if the element does not exist.
        System.out.println(floor2);

        SortedSet<String> headSet1 = treeSet.headSet("Orange");// returns the elements from the beginning to the given element.
        System.out.println(headSet1);

        NavigableSet<String> headSet2 = treeSet.headSet("Orange",true);
        System.out.println(headSet2);

        SortedSet<String> tailSet1 = treeSet.tailSet("Mango"); // returns the elements from the end to the beginning
        System.out.println(tailSet1);

        SortedSet<String> tailSet2 = treeSet.tailSet("Mango",false); // returns the elements from the end to the beginning
        System.out.println(tailSet2);



























    }
}
