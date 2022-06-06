package day11;

public class Day11WhileLoop01 {
    public static void main(String[] args) {
        //type code to print the integers divisible by 4 and 6 from 13 to 211
        //1st way by using For loop
//        for (int i = 13; i < 212; i++) {
//            if (i%4 == 0  && i%6 == 0) {
//                System.out.print(i+" ");
//            }
//        }
//        System.out.println(" ");
//
//
//        //2nd way by using While Loop
//        int i = 13;
//        while (i<212){
//            if (i%4 == 0  && i%6 == 0) {
//                System.out.print(i + " ");
//            }
//            i++;
//        }

        //type code to print integers from 3 to 5 by using while loop

//        int i = 3;
//
//        while (i<6){
//            System.out.print(i+" ");
//            i++;
//        }


        // *********************** interview question ************************
        //Type code to check if a given integer is palindrome or not
        // palindrome: 121 <==> 121              123321 <==> 123321

//        int i = 121;
//        String iS = String.valueOf(i); // 121 as a string
//
//        int k = iS.length()-1;
//        String reversed = "";
//        while(k>=0){
//            reversed += iS.charAt(k);
//        if (iS.equals(reversed)) {
//            System.out.println("It is palindrome number");
//        }
//            k--;
//        }
//        System.out.println(reversed);

//        int k = 121;
//        String iS = String.valueOf(k);
//        String reversed = "";
//
//        for (int i = iS.length()-1; i >= 0 ; i--) {
//                        reversed+= iS.charAt(i);
//            if (iS.equals(reversed)) {
//                System.out.println("It is palindrome number");
//            }
//        }
//        System.out.println(reversed);

        //Type code to print the sum of the digits of an integer.

//        int i = 237;
//        int container = 0;
//
//
//        while(i > 0){
//            container += i%10;
//            i/=10;
//        }
//        System.out.println(container);


        //type code to create a multiplication table for any given number
        // 3x1=3 3x2=6 3x3=9 ... 3x10=30

//        int i = 3;
//        int k = 1;
//        while(k < 11){
//            System.out.println(i + "x" + k + "=" + i*k);
//            k++;
//        }
























































    }
}
