package practice_questions.week01;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        //Type a code that calculates the hypotenuse.
        // a^2 + b^2 = c^2
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first side of the right triangle");
        double a = input.nextDouble();
        System.out.println("Please enter second side of the right triangle");
        double b = input.nextDouble();


        double hypotenuse = Math.sqrt(a*a + b*b);

//        double hypotenusePower = Math.pow(a,2) + Math.pow(b,2);
//        double hypotenuse = Math.sqrt(hypotenusePower);
        System.out.println("The hypotenuse:" + " " + hypotenuse);
    }
}
