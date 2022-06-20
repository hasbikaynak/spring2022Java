package practice_questions.week07;

import java.util.Arrays;
import java.util.Collections;

public class Q04 {
    public static void main(String[] args) {
        // Convert the "Congratulations" word to "sn**t*l*t*rgn*C" by using Array methods.
        String s = "Congratulations";
        String sArr[] = s.split("");
        String sNew = "";
        for (int i = sArr.length-1; i > -1 ; i--) {
            if (sArr[i].equals("a") || sArr[i].equals("e")|| sArr[i].equals("i")|| sArr[i].equals("o")||sArr[i].equals("u")) {
                sArr[i] = "*";
            }
                sNew+= sArr[i];
        }
        System.out.println(sNew);
    }
}
