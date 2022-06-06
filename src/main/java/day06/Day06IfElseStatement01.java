package day06;

import java.util.Scanner;

public class Day06IfElseStatement01 {
    public static void main(String[] args) {
        /*
        If the score is less than 50 then you will fail
        If the score is greater than or equal to 50 then you will pass
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your score");
        int score = scanner.nextInt();
        String result = (score<50)?"You failed":"You passed";
        System.out.println(result);


        /*
        Ask user to enter the number of day, then print the name of the day whose number was given
        2==> Monday, 5 ==> Thursday
        */
        System.out.println("Please enter the day number");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("You typed a wrong character");
        }
    }
}
