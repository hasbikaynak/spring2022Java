package interview_questions.Importante;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;

public class Iq06 {
    //Print repeated characters in a given String
    //aabccccdd ==> acd
    public static void main(String[] args) {
        System.out.println(findRepeatedCharacters("aabccccdd"));
        findRepeatedCharacters1("aabccccdd");
    }
    public static String findRepeatedCharacters(String word) {
        String s = "";

        for (int i = 0; i < word.length(); i++) {

            String s1 = word.substring(i, i + 1);

            if (word.indexOf(s1) != word.lastIndexOf(s1)) {

                if (!s.contains(s1 + "")) {
                    s += s1;
                }
            }
        }
        return s;
    }


    public static void findRepeatedCharacters1(String word){
        String a[] = word.split("");
        HashMap<String, Integer> map = new HashMap<>();
        for (String w: a){
            if (!map.containsKey(w)) {
                map.put(w,1);
            }
            else {
                map.put(w, map.get(w)+1);
            }
        }
        for (Map.Entry<String,Integer> w : map.entrySet())
            if (w.getValue() > 1) {
                System.out.print(w+ " ");
            }
    }
}






