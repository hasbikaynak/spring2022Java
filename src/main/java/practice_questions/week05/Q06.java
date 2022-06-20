package practice_questions.week05;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        /*
   Ask user to enter an integer and Print 'Even' for even integers,
   increase  the value by 3 for odd integers and print it on console by using ternary.
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = input.nextInt();

        var result =  num %2 ==0 ? "Even" : num+3;
        System.out.println(result);



    }
}
