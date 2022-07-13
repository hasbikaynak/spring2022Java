package day27;

import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {
        /*
        TreeMap is not thread-safe and not synchronized.
        TreeMap puts the elements in natural order.
        TreeMap does not accept null in key part.
        TreeMap accepts multiple null in value part
        TreeMap is the slowest map, because it will check if, gets a null in key part and if, get a null in value part because it does accept the null in the value part.
         */
        TreeMap<Integer,String> treeMap = new TreeMap<>();

        treeMap.put(103,"Tom");
        treeMap.put(105,"Hanks");
        treeMap.put(104,"Deli");
        //treeMap.put(null,"It is null"); // NullPointerException
        treeMap.put(106,null);

        System.out.println(treeMap);

        /*
        Map interface
         i)HashMap
         ii)HashTable
         iii)TreeMap
         */
    }
}
