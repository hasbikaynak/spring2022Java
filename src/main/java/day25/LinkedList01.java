package day25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList();
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");

        linkedList.add("A");
        linkedList.add(0,"Bubble");
        linkedList.addAll(list);
        linkedList.addAll(1,list);
        linkedList.addFirst("K");
        linkedList.addLast("Z");


        System.out.println(linkedList.remove()); // Removes the first node and returns it to you.
        System.out.println(linkedList.remove("W"));
        linkedList.remove(3);
        //linkedList.removeAll(list);

       // linkedList.clear();

        linkedList.removeIf(t->t.length() < 2);

       // System.out.println(linkedList.element());

        System.out.println(linkedList.peek());

        linkedList.poll();

        System.out.println(linkedList);

    }
}
