package practice_questions.week03;

import java.util.Arrays;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        /*
         Create a method and
		 from a given array find all pairs whose sum is a given number,
		 {4,6,5,-10,8,5,20} ===> 10
		 4 + 6 = 10
         5 + 5 = 10
        -10 + 20 = 10
		 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Array`s length");
        int length = input.nextInt();

        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter the " + i +". element your Array");
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter a number");
        int givenNum = input.nextInt();
        findPairs(givenNum,arr);

    }
    public static void findPairs(int givenNum, int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == givenNum) {
                    System.out.println(arr[i] + " + " + arr[j] +" = "+ givenNum);
                }
            }
        }
    }

    public static void scannerInput()
    {

    }
}
