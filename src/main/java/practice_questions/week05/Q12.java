package practice_questions.week05;

import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        /*
     Find the sum of the least and the greatest price given in a String list
     Example: List<String> myList = new List<String>{"$12.99", "$8.25", "$23.60", "54.45"}; ==> 62.70
     */
        List<String> myList = Arrays.asList("$12.99", "$8.25", "$23.60", "54.45");
        List<Double> myList2 = new ArrayList<>();


        for (String w:myList) {
          Double price =  Double.valueOf(w.replace("$",""));
          myList2.add(price);
        }

        Collections.sort(myList2);

        Double minPrice = myList2.get(0);
        Double maxPrice = myList2.get(myList2.size()-1);

        Double sum = minPrice + maxPrice;

        System.out.println(sum);



    }
}
