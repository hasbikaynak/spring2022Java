package practice_questions.week11;

import java.util.Arrays;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Create a method to take a six element array from user and put the odd numbers into a list and print it.
        int[] arr = new int[6];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Element " + (i+1));
            int userValue = input.nextInt();
            if (userValue %2 != 0) {
                arr[i] = userValue;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
