package practice_questions.week10;

import java.util.Scanner;

public class Q03_Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight");
        double weight = input.nextDouble();

        System.out.println("Enter height");
        double height = input.nextDouble();

        Q03_BMI person1 = new Q03_BMI(weight,height);
        person1.calculateBMI();
    }
}
