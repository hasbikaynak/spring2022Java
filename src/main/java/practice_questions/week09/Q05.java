package practice_questions.week09;

import org.jetbrains.annotations.NotNull;

public class Q05 {
    /*
	Create a method to calculate 4 students' 6, 4, 3 and 5 exams' average respectively.
    */
    public static void main(String[] args) {
        calculateAverage("Mehmet",50,30,40,70,80,68);
        calculateAverage("Tom",50,30,80,68);
        calculateAverage("Angelika",50,30,68);
        calculateAverage("Natalia",50,30,68,49,70);
    }

    private static void calculateAverage(String name, double @NotNull ... mark){
        double sum = 0;
        for (double w: mark) {
            sum += w;
        }
        double average = sum/mark.length;
        System.out.println("Average of marks for the "+name + " is "+  String.format("%.2f",average));
    }
}
