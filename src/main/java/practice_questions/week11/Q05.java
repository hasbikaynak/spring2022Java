package practice_questions.week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05 {
    /*
     * Type a program that displays all the 7-day earnings of the market on a daily basis.
     - Type a method that calculate the average amount the market earns this week.
     - Type a method that calculate which days market earns above average.
     - Type a method that calculate which days market earns below average.
     *
     *  Step 1 : Create an ArrayList containing the days.
     Step 2 : Create an ArrayList to which we will add the daily earnings.
     Step 3 : With the while loop, take the 7-day earnings from the user one by one and add them to the daily earnings ArrayList.
     Step 4 : Get the average earnings with the method called averageOfEarnings().
     Step 5 : Create a method called daysAboveAverage().
              Compare all days with average earnings with for loop
              If higher than average earnings, return those days.
     Step 6 : Create a method called daysBelowAverage().
              Compare all days with average earnings with for loop
              If less than average earnings, return those days.
     */
   static List<String> days = Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday");
   static List<Double> earnings = new ArrayList<>();
   static Scanner input = new Scanner(System.in);

   static double totalEarnings = 0;

    public static void main(String[] args) {

        bringWhileLoop();
        System.out.println("Average of earning is "+ averageOfEarnings());
        System.out.println("Days above the average are "+ daysAboveAverage());
        System.out.println("Days below the average are "+daysBelowAverage());

    }

    private static void bringWhileLoop() {
        int day = 0;
        while(day < 7){
            System.out.println("Earning for " + days.get(day));

            double dailyEarning = input.nextDouble();

            earnings.add(dailyEarning);

            totalEarnings+=dailyEarning;
            day++;
        }
        System.out.println("Daily earnings "+earnings);
        System.out.println("Total earnings "+ totalEarnings);
    }

    private static double averageOfEarnings(){
        return totalEarnings / days.size();
    }

    private static String daysAboveAverage(){
        String daysAboveAverageEarning = "";
        for (int i = 0; i < days.size(); i++) {
            if (earnings.get(i) > averageOfEarnings()) {
                daysAboveAverageEarning+=days.get(i) + " ";
            }
        }
        return daysAboveAverageEarning;
    }

    private static String daysBelowAverage(){
        String daysBelowAverageEarning = "";
        for (int i = 0; i < days.size(); i++) {
            if (earnings.get(i) < averageOfEarnings()) {
                daysBelowAverageEarning+=days.get(i) + " ";
            }
        }
        return daysBelowAverageEarning;
    }

}
