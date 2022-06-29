package homeworks;

import java.util.ArrayList;
import java.util.Iterator;

public class DuplicateElements {
    public static void main(String[] args) {
        // Create an ArrayList with an initial capacity of 10.
        ArrayList<String> al = new ArrayList<String>();

// Adding elements to the list.
        al.add("A"); // Adding element at index 0.
        al.add("B"); // Adding element at index 1.
        al.add("C"); // Adding element at index 2.
        al.add("D"); // Adding element at index 3.
        System.out.println("Original insertion array list order: " +al);

// Adding a duplicate element at position 2 and end of the list.
        al.add(2, "B");
        al.add("A");
        System.out.println("After adding duplicate element, ArrayList insertion order ");

// Call iterator() method to iterate over the elements of the array list.
        Iterator<String> itr = al.iterator();
        while(itr.hasNext())
        {
            String str = itr.next();
            System.out.print(str);
        }
    }
}

