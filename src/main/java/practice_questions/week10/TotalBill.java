package practice_questions.week10;

import java.util.Scanner;

public class TotalBill {
    //    Write a program that takes input as an electricity unit charges from the user and calculate the total bill according to the following conditions:
//    For the first 50 unit, $0.50/unit
//    For the next 100 unit, $0.75/unit
//    For the next 100 unit, $1.20/unit
//    Unit above 250, $1.50/unit
//    add 20% of the tax to the total bill
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the quantity of unit in order to learn charges");
        int unit = input.nextInt();

        double sum = 0;

        if (unit >= 0  && unit <= 50 ) {
            sum = unit * 0.50;
        }

       else if (unit > 50 && unit <= 150) {
            sum = (50 * 0.50) + (unit - 50) * 0.75;
        }

       else if (unit > 150 && unit <= 250) {
            sum =  (50 * 0.50) + (100 * 0.75) + (unit - 150) * 1.20;
        }

       else if(unit > 250) {
            sum = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + (unit - 250) * 1.50;
        }
       else {
            System.out.println("Invalid Input");
        }
        sum = sum / 0.2;


//homework electricity bill= Math.max(x, 0) *50+Math.max(x-50, 0) *25+Math.max(x-150, 0) *45+Math.max(x-250, 0) *30



        System.out.println(sum);
    }

}
