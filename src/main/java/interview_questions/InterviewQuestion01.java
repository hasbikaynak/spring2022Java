package interview_questions;

import java.util.Scanner;

public class InterviewQuestion01 {
    public static void main(String[] args) {
        /*
        Ask user to enter 2 numbers then swap them
        a=12  b=13 ==> a=13 b=12
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = input.nextDouble();

        System.out.println("Enter second number");
        double num2 = input.nextDouble();

        System.out.println("Before the swap " +" "+num1 + " - " + num2);
//        // 1.way by using 3. variable
//        double temp = 0;
//        //I
//        temp = num2;
//        //II
//        num2 = num1;
//        //III
//        num1 = temp;
//
//        System.out.println("After the swap " + " "+num1 + " - " + num2);

        //2. way without using 3. variable


        System.out.println("Before the swap " +" "+ num1 + " - " + num2);

        //I
        num1 = num1 + num2;
        //II
        num2 = num1 - num2;
        //III
        num1 = num1 - num2;

        System.out.println("After the swap " + " "+ num1 + " - " + num2);
    }
}
