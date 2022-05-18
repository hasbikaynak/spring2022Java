import java.util.Scanner;

public class Day04Scanner02 {
    public static void main(String[] args) {

        /*
        Ask user to enter the width and the length of a rectangle then print
        the area and perimeter on the console
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the width of the rectangle");
        double width = scanner.nextInt();
        System.out.println("Please enter the length of the rectangle");
        double length = scanner.nextInt();

        System.out.println("Area of the rectangle is: " + width*length);
        System.out.println("Perimeter of the rectangle is: " + 2*(length+width));
    }
}
