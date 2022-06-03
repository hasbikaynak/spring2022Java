package Homeworks;

import java.util.Scanner;

public class ForLoopHomework {
    public static void main(String[] args) {
//        /*
//        * Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
//with a space between two consecutive integers
//*       */
//
//        int container = 0;
//
//        for (int i = 120; i > 10 ; i--) {
//            if (i %4 == 0 && i %6 == 0) {
//
//                System.out.print(i + " ");
//            }
//        }

        /*

       Type code to print repeated characters in a String. For example; accessories ⇒ ces
         */

//        String s = "accessories";
//
//        String container = "";
//        for (int i = 0; i < s.length(); i++) {
//            String c = s.substring(i,i+1); // a
//            if (s.indexOf(c) != s.lastIndexOf(c) ) {
//                if (!container.contains(c)) {
//                    container+=c;
//                }
//            }
//        } System.out.println(container);

        /*Type code to check whether a String is palindrome or not. If a String is the same with its
reverse then it is called palindrome. For example; “anna”, “123321” are palindromes*/

//        int i = 123331;
//
//        String sI = String.valueOf(i); // 123321
//
//        String reversed = "";
//
//        for (int j = sI.length()-1; j >= 0; j--) {
//            reversed+=sI.charAt(j);
//            if (sI.equals(reversed)) {
//                System.out.println("Your integer value is palindrome");
//            }
//        }
//        System.out.println(reversed);

//        type code to print the unique digits in an integer. Example; 223878 ⇒ 37

//        int i = 223878;
//
//        String sI = String.valueOf(i); // 223878
//
//        for (int j = 0; j < sI.length(); j++) {
//            char c = sI.charAt(j);
//            if (sI.indexOf(c) == sI.lastIndexOf(c) ) {
//                System.out.print(c);
//            }
//        }

        /*Type code to draw the following image by using a for loop.

         A A A A A
         A A A A A
         A A A A A
*/


//        int column = 5;
//        int row = 3;
//
//        for (int i = 0; i < row; i++) {
//            String container = "";
//            for (int j = 0; j < column; j++) {
//                container+="A ";
//
//            }System.out.println(container);
//        }

        /*Type code to draw the following image by using a for loop.
                         A
                         A A
                         A A A
                         A A A A
                         */

//        int row = 4;
//
//
//        for (int i = 0; i <= row; i++) {
//            String container = "";
//            for (int j = 0; j <= i; j++) {
//                container+= "A ";
//            }
//            System.out.println(container);
//        }


        /*Type code to create multiplication table like
3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30*/

//        int j = 3;
//
//        for (int i = 1; i < 11 ; i++) {
//            System.out.print(j +"x"+ i +"="+ i*j+" ");
//        }


        /* Type code to print odd integers from 20 to 3 in the same line with a space between two
consecutive ones.*/

//        for (int i = 20; i > 2 ; i--) {
//            if (i %2 != 0) {
//                System.out.print(i + " ");
//            }
//        }

        /*Type code to print all lowercase characters in a String with an asterix.
For example; 'Ali Can?' ==> l*i*a*n*
*/

//        String s = "Ali Can?";
//
//        String sLowerCaseLetters = s.replaceAll("[^a-z]",""); //lian
//        String container = "";
//        for (int i = 0; i < sLowerCaseLetters.length(); i++) {
//            container = container + sLowerCaseLetters.charAt(i) + "*";
//        }
//        System.out.println(container);

/*
 Type code to print digits just in the decimal part of the given decimal number with an
asterix. For example; 75.4238 Ş *4*2*3*8
*/
//        double d = 75.4238;
//
//        String sD = String.valueOf(d); //75.4238
//
//        String sDDecimal = sD.split("\\.")[1]; // 4238
//
//        String container = "";
//        for (int i = 0; i < sDDecimal.length(); i++) {
//            container = container + "*"+ sDDecimal.charAt(i);
//        }
//        System.out.println(container);

//        Type code to reverse a String. Example; Mark ==> kraM

//        String s = "Mark";
//
//        String container = "";
//        for (int i = s.length()-1; i >= 0 ; i--) {
//            container+=s.charAt(i);
//        }
//        System.out.println(container);


        /*
        Type code to draw the following image by using a for loop.
A A A A A A A A
A X X X X X X A
A X X X X X X A
A X X X X X X A
        */

//        int rows =4, columns = 8;
//
//
//        for (int i = 1; i <= rows; i++) {
//            String s = "";
//            if (i == 1 || i==rows) {
//                for (int j = 1; j <= columns; j++) {
//                    s+="A ";
//                }
//                System.out.println(s);
//            }
//            else {
//                s+="A ";
//                for (int j = 2; j < columns; j++) {
//                    s+="X ";
//                }
//                s+="A ";
//                System.out.println(s);
//            }
//        }



//        Type code to find the sum of the integers from 3 to 14


//        int container = 0;
//        for (int i = 3; i < 15; i++) {
//            container+=i;
//        }
//        System.out.println(container);

//        Type code to print characters from 'C' to 'A' on the console by using do-while loop
//        char i = 'C';
//        String s = "";
//        do {
//            s+=i;
//            i--;
//        }while (i>='A');
//        System.out.println(s);
//
//        System.out.println("Relations");
//
//        char ch = 'C';
//        String result = "";
//        do{
//            result = result + ch;
//            ch--;
//        }while(ch>='A');
//        System.out.println(result);



     //Type all characters before the first occurrence of 'm' in a String

//        String s = "Number";
//
//        String container = "";
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            container+=c;
//            if (c == 'm') {
//                break;
//            }
//        }
//        System.out.print(container);

//        Find the total number of characters different from space and punctuation marks in a String

//        String s = "Java is a strongly typed, object-oriented programming language.";
//
//        String sWithoutSpaceAndPunctuationMarks = s.replaceAll("\\s","").replaceAll("\\p{Punct}",""); // Javaisastronglytypedobkectorientedprogramminlanguage
//
//        System.out.println(sWithoutSpaceAndPunctuationMarks.length());

//        Type code to draw the following image by using a for loop.
//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *



//        int row = 6;
//        String s = "";
//
//        for (int i = 1; i <=row ; i++) {
//            for (int j = row; j >=i ; j--) {
//                s+="* ";
//            }
//            System.out.println(s);
//            s="";
//        }

        /*
        * Type code to find the sum of the unique digits of an integer
Example: 12133455 Ş 2+4=6
* */
//        int i = 12133455;
//
//        String sI = String.valueOf(i); // 12133455
//
//        int s = 0;
//        for (int j = 0; j < sI.length(); j++) {
//            String c = sI.substring(j,j+1);
//            if (sI.indexOf(c) == sI.lastIndexOf(c)) {
//                s+= Integer.valueOf(c);
//            }
//        }
//
//        System.out.println(s);


        //TODO 23

















    }
}
































