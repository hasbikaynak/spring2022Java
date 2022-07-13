package practice_questions.week11;

import java.util.HashMap;
import java.util.Map;

public class Q06 {
    public static void main(String[] args) {
//        Create a method to count the number of  each words in a String one by one.
//    input: "Ali came to school and Ayse came to school"
//    output: Ali = 1 came = 2 to= 2 school= 2 and= 1 Ayse= 1
        String  s = "Ali came to school and Ayse came to school";
        System.out.println(countNumberOfStringWords(s));
    }
    private static Map<String,Integer> countNumberOfStringWords(String s){
        Map<String,Integer> map = new HashMap<>();

          String[] arr = s.split(" ");

        for (String w:arr) {
            if (map.containsKey(w)) {
                map.put(w,map.get(w)+1);
            }
            else {
                map.put(w,1);
            }
        }
        return map;
    }
}
