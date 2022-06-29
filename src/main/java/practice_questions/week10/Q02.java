package practice_questions.week10;

import java.util.Scanner;

public class Q02 {
    /*
  Ask user to enter a number and print on console number by number matrix.
  Example:
  Input: 10
  Output:
  1 0 0 1 1 0 0 0 1 1
  0 0 1 0 1 0 1 0 0 0
  0 1 0 1 0 0 0 0 0 1
  1 1 1 0 0 0 0 1 1 1
  1 1 0 1 1 1 0 1 0 0
  1 0 0 0 1 1 0 0 0 0
  0 0 1 0 0 0 0 1 1 1
  1 1 0 1 0 1 0 0 1 0
  0 0 1 0 0 0 0 1 1 0
  1 1 1 0 0 1 1 1 1 0
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        int size = input.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
               int random = (int) (Math.random()*2);
                System.out.print(random+" ");
            }
            System.out.println();
        }
    }
}
