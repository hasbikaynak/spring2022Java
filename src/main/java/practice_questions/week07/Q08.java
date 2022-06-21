package practice_questions.week07;

import java.util.Arrays;

public class Q08 {
    public static void main(String[] args) {
        /*
         * create a method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         */
        System.out.println(Arrays.toString(nameAsCharArray("John")));
    }
    public static char[] nameAsCharArray(String name){
        char[] arr = new char[name.length()];
        for (int i = 0; i < name.length(); i++) {
            arr[i] = name.charAt(i);
        }
        return arr;
    }
}
