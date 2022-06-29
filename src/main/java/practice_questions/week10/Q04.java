package practice_questions.week10;

import java.util.ArrayList;
import java.util.List;

public class Q04 {
    /*
    Count the frequency of the letters in a given String as the format below:
    Input: String str = "Java is so Good";
    Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
     */
    public static void main(String[] args) {
        String s = "Java is so Good";

        String container = "";
        for (int i = 0; i < s.length(); i++) {
            int counter = 1;
            for (int j = i+1; j < s.length() ; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    counter++;
                }
            }
            if (!container.contains(String.valueOf(s.charAt(i)))) {
                container += s.charAt(i)+""+counter+" ";
            }
        }
        System.out.println(container);
    }
}
