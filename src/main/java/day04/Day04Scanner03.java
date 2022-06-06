package day04;

import java.util.Scanner;

public class Day04Scanner03 {
    public static void main(String[] args) {
        /*
        Ask user to enter the width, length and the height of a rectangular prism then find the volume.
        Volume = width * length * height
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the width of the rectangle");
        double width = scanner.nextDouble();
        System.out.println("Please enter the length of the rectangle");
        double length = scanner.nextDouble();
        System.out.println("Please enter the height of the rectangle");
        double height = scanner.nextDouble();

        System.out.println("Volume of the rectangle is: " + width*length*height);
    }

}
