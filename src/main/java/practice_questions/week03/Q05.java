package practice_questions.week03;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
    /* Create an integer array by the help of user(ask user length and elements of array)
     * Ask user the index of element that user wants to remove.
     * Print the array on the console after removing
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Length of the Array");
        int length = input.nextInt();

        int arr[] = new int[length];


        for (int i = 0; i < length; i++) {
            System.out.println("Enter the " + i + ". element");
            int elementsOfArray = input.nextInt();
            arr[i] = elementsOfArray;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the index of the element that you want to remove");
        int remove = input.nextInt(); //1

        int brr[] = new int[arr.length-1]; // [0,0,0,0]

        int idx = 0;

        for (int w: arr
             ) {
            if (w == arr[remove]) {
                continue;
            }
            brr[idx]= w;
            idx++;
        }
        System.out.println(Arrays.toString(brr));

























    }
}
