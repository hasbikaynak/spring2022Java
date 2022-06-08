package practice_questions.week04;

import java.util.Arrays;

public class Week04Review {
    public static void main(String[] args) {
          /* Type code to ask user to enter the number of row
        and print the shape below according to that number:
         1
         2 3
         4 5 6
         7 8 9 10
         11 12 13 14 15
         16 17 18 19 20 21
         */

//        int row = 6;
//
//        int sum=1;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print(sum + " ");
//                sum++;
//            }
//            System.out.println();
//        }


        //Type a method to change the sign(+-) of the elements in a given array.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6

//        int arr[] = {1,2,-3,4,-5,-6};
//
//        int brr[] = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            brr[i] = -1 * arr[i];
//        }
//        System.out.println(Arrays.toString(brr));


        //Type code to print the elements of an array those are greater than average.
        //int[] arr={5, 9, 15, 1, 0, 11, 3};  output:

//        int[] arr={5, 9, 15, 1, 0, 11, 3};
//
//        int container = 0;
//
//        for (int w:arr
//             ) {
//            container += w;
//        }
//        System.out.println(container); // 44
//
//        int average = container / arr.length;
//
//
//        int container2 = 0;
//        for (int w:arr
//             ) {
//            if (w > average) {
//                System.out.print(w + " ");
//            }
//        }

         /*
    Type code to calculate the sum of the numbers for each inner arrays in
    a multidimensional array and print them on console as single-dimensional array.
    input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
    */


        int arr[][] = {{10,20,30},{4},{6,7,20}};

        int brr[] = new int[arr.length]; //3

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                brr[i] += arr[i][j];
            }
        }
        System.out.println(Arrays.toString(brr));
























    }
}
