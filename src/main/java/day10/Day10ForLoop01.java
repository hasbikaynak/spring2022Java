package day10;

import java.nio.charset.StandardCharsets;

public class Day10ForLoop01 {
    public static void main(String[] args) {
        //Type "Hi!" on the console 5 times.

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hi!");
//        }

        //Type integers from 10 to 3 on the console by using for loop
//        for (int i = 10; i > 2; i--) {
//            System.out.println(i);
//        }

        //Type even integers from 4 to 15  on the console

//        for (int i = 4; i < 16 ; i++) {
//            if (i %2 == 0) {
//                System.out.println(i);
//            }
//        }

        //Type odd integers from 4 to 15  on the console

//        for (int i = 4; i < 16; i++) {
//            if (i %2 != 0) {
//                System.out.println(i);
//            }
//        }

        // Print all integers from 10 to 32 except from 17 on the console

//        for (int i = 10; i < 33; i++) {
//            if (i != 17) {
//                System.out.println(i);
//            }
//        }


//        for (int i = 10; i < 33; i++) {
//            if (i == 17) {
//                continue;
//            }
//            System.out.println(i);
//        }

        // Print all integers from 10 to 32 except from if the integer is less than 21 greater than 18

//        for (int i = 10; i < 33; i++) {
//            if (i < 21 && i > 18) {
//                continue;
//            }
//            System.out.println(i);
//        }

//continue ==> to skip some steps in a loop we use continue keyword *********************

        //Oracle java documentation

        //Type String characters one by one on the console if u see the "x" in the String value, stop printing
        //Publix is the best  ==> Publi

        String s = "Publix is the best";

        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == 'x') {
            break;
            }
            System.out.print(s.charAt(i));
        }




















    }
}
