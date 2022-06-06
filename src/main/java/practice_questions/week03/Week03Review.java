package practice_questions.week03;

import java.util.Arrays;
import java.util.Scanner;

public class Week03Review {
    public static void main(String[] args) {
        /* Create an integer array by the help of user(ask user length and elements of array)
         * Ask user the index of element that user wants to remove.
         * Print the array on the console after removing
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int length = input.nextInt();

        int arr[] = new int[length];  // [0,0,0,0]

        ;
        for (int i = 0; i < length; i++) {
            System.out.println("enter the " + (i+1) +". element of the array");
            arr[i] = input.nextInt(); //[4,3,1,2]
        }

        Arrays.sort(arr);//[1,2,3,4]

        System.out.println("enter the index of the element that you want to remove");
        int remove = input.nextInt(); //2 ==> number 3

        int brr[] = new int[arr.length-1]; //[0,0,0]

        int idx = 0;
        for (int w:arr
             ) {

            if (w == arr[remove]) {
                continue;
            }
            brr[idx] = w;
            idx++;
        }
        System.out.println(Arrays.toString(brr)); //[1,2,4]

















    }
}
