package day15;

import java.util.Arrays;

public class Day15Review {
    public static void main(String[] args) {
        //Example 1: Find the sum of the first and the last inner array elements. // 12 - 3 -7+16 = 18

//        int arr[][] = {{12,-3},{5,11},{-7,16}};
//
//        int sum = 0;
//
//        for (int[] w:arr
//             ) {
//            if (w == arr[0] || w == arr[arr.length-1]) {
//                for (int u:w
//                ) {
//                    sum += u;
//                }
//            }
//
//        }
//        System.out.println(sum);


        //Type code to find the total amount of elements in the multidimensional array

//        int arr[][] = {{12,-3},{5,11},{-7,16}};
//
//        int sum = 0;
//        for (int[] w:arr
//             ) {
//            for (int u:w
//                 ) {
//                sum+=u;
//            }
//        }
//        System.out.println(sum);

         //Print the elements which has "a" in it from a multidimensional array.
//        String arr[][]={{"Java","is"},{"easy","to","learn"},{"if","you","study","hard"}};
//
//        for (String[] w:arr
//             ) {
//            for (String u:w
//                 ) {
//                if (u.contains("a")) {
//                    System.out.print(u+ " ");
//                }
//            }
//        }

        //Convert two dimensional array to one dimensional array
//        String arr[][]={{"Java","is"},{"easy","to","learn"},{"if","you","study","hard"}};
//
//        int sum = 0;
//
//        for (String[] w:arr
//             ) {
//            sum += w.length;
//        }
//
//        String brr[] = new String[sum]; //9
//
//        int idx = 0;
//        for (String[] w:arr
//             ) {
//            for (String u:w
//                 ) {
//                brr[idx] = u;
//                idx++;
//            }
//        }
//
//        System.out.println(Arrays.toString(brr));


        // Find the sum of the max and min element in an integer multidimensional array
        int arr[][] = {{5,23},{11,13,15},{6},{-2,3,5,12}};

        int max = arr[0][0];
        int min = arr[0][0];

        for (int[] w:arr
             ) {
            for (int u:w
                 ) {
                max = Math.max(max,u);
                min = Math.min(min,u);
            }
        }

        System.out.print(max  + min);

















    }
}
