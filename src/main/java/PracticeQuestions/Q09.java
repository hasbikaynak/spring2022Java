package PracticeQuestions;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        /*
    A company decided to give bonus of 5% of salary to employee if his/her year of
    service is 5 and more than 5 years.
    Ask user for their salary and year of service and print the net bonus amount.
    If employee can not get bonus, print how many more years he/she should work.
    EXAMPLE:
    INPUT   :   Year    => 4 year service
                Salary  => 4000
    OUTPUT :  You need to work 1 year(s) to get bonus

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many years you have been working");
        int year = Math.abs(input.nextInt());

        System.out.println("Please enter how much you gain");
        double salary = Math.abs(input.nextDouble());

        if (year < 5) {
            System.out.println(String.format("You should work %s more year" , 5 - year));
        }
        else {
            double bonus = salary*5/100;
            System.out.println(String.format("Thanks for your loyalty your new salary is %s$ more" , bonus));
        }
    }
}
