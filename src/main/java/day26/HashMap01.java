package day26;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    /*
     1) HashMap is not-thread safe (does not work with multi-thread)
     2) HashMap is non-synchronized
     3) HashMap does not put entries in any order
     4) You can use a single null in key part. Null is also value so key cannot be repeated.
     5) You can use multiple null in values part.
     */

    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Tom Hanks", 13);
        hashMap.put("Brad Pitt", 24);
        hashMap.put("Angelina Julie", 46);
        hashMap.put("Cuneyt Arkin", 85);
        hashMap.put("Alex Alex", 33);

        System.out.println(hashMap);

        //How to work with keys
        Set<String> keys = hashMap.keySet();

        for (String w: keys) {
            System.out.println(w+"!");
        }

        // How many letters were used in all names?
        int container = 0;
        for (String w:keys) {
            container+= w.replaceAll("[^a-zA-Z]","").length();
        }

        System.out.println(container);


        //How to work with values?
        //Find the average age of the students

        Collection<Integer> values = hashMap.values();

        int studentLength = values.size();

        double container1 = 0;
        for (int w: values) {
            container1+= w;
        }

        double averageOfAge = container1/studentLength;

        System.out.println(averageOfAge);

        //How to get a specific value?
        int cuneyt_arkin = hashMap.get("Cuneyt Arkin");
        System.out.println(cuneyt_arkin);

       Integer age =  hashMap.getOrDefault("Cuneyt ArkingXL", 0);
        System.out.println(age);

        hashMap.putIfAbsent("Angelina Julie",32);
        System.out.println(hashMap);

        // if you want to update specific value use put()
        hashMap.put("Alex Alex",50);

        // How to get entries from a Map
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();

        System.out.println(entries); // [Tom Hanks=13, Brad Pitt=24, Cuneyt Arkin=85, Angelina Julie=46, Alex Alex=50]  Maps use curly braces, but Set is collection that`s why used brackets.

        //Example 3: Get the initials of first 3 entries.

        String initials = "";
        int counter = 0;
        for(Map.Entry<String, Integer> w: entries){
            initials += w.getKey().charAt(0);
          counter++;
            if (counter == 3) {
                break;
            }
        }
        System.out.println(initials);


        boolean isContain =  hashMap.containsKey("Alex Alex");
        System.out.println(isContain);

        boolean isContain1 =hashMap.containsValue(50);
        System.out.println(isContain1);

        boolean newCuneyt = hashMap.replace("Cuneyt Arkin", 85,83);
        System.out.println(newCuneyt);

        System.out.println(hashMap);



    }
}
