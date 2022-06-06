package day07;

import java.util.Scanner;

public class Day07Switch02 {
    public static void main(String[] args) {
        // ask user to enter day number ,then print all day names starting with the given day name
        // User ==> 5 Output ==> Thursday - Friday - Saturday
        // User ==> 3 Output ==> Tuesday - Wednesday - Thursday - Friday - Saturday

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day number");
        int dayNumber = input.nextInt();

        switch (dayNumber){
            case 1:
                System.out.println("Sunday");
            case 2:
                System.out.println("Monday");
            case 3:
                System.out.println("Tuesday");
            case 4:
                System.out.println("Wednesday");
            case 5:
                System.out.println("Thursday");
            case 6:
                System.out.println("Friday");
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Please enter a valid day number");
        }
    }
}
