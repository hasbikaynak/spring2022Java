package day26;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet02 {
    public static void main(String[] args) {
        /*
      Question1: What do you do to store unique elements in natural order?
        I use TreeSet
      Question2: As you know TreeSet is so slow in adding and removing elements, what do you do to make it fast?
        i) Create a HashSet
        ii) Add the elements into HashSet
        iii) Convert HashSet to TreeSet
         */
//I. Way
        int time1 = LocalTime.now().getNano();
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("C");
        hashSet.add("B");
        hashSet.add("T");
        hashSet.add("M");
        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        int time2 = LocalTime.now().getNano();

//II. Way
        TreeSet<String> treeSet1 = new TreeSet<>();

        treeSet1.add("A");
        treeSet1.add("C");
        treeSet1.add("B");
        treeSet1.add("T");
        treeSet1.add("M");
        int time3 = LocalTime.now().getNano();

        System.out.println("HashSet + TreeSet "+ (time2-time1));
        System.out.println("TreeSet " + (time3-time2));
    }
}
