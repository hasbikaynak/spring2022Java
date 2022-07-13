package day27;

import java.util.Hashtable;

public class HashTable01 {
    /**
     * interview question
     * HashMap is not synchronized and not thread-safe because of that Java created Hashtable
     * Hashtable puts the elements in random order
     * Hashtable does not allow using null neither in key nor in value
     * Hashtable is slower than HashMap because it is thread-safe and synchronized and checking not to be null
     */
    public static void main(String[] args) {
        Hashtable<String,Integer> hashtable = new Hashtable<>();

        hashtable.put("Tom",3);
        hashtable.put("Hanks",5);
        //hashtable.put(null,0);
        hashtable.put("A",1);
        System.out.println(hashtable);

    }

}
