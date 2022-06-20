package practice_questions.week05;

import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Q10 {
    public static void main(String[] args) {
        /*
     If the list has 15 as element, change all 15s to 51
     Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
     */
        List<Integer> list = Arrays.asList(12,11,13,34,43);
        int flag =0;
        for (Integer w:list) {
            if (w == 15) {
                flag++;
                list.set(list.indexOf(w),51);
            }
        }
        if (flag == 0) {
            System.out.println("List does not contain the expected element");
        }
        System.out.println(list);
    }
}
