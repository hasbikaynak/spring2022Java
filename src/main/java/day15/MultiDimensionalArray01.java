package day15;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {
//        int mda[][] = new int[3][2];
//
//        mda[1][1] = 12;                          //{{12,-3},{5,11},{-7,16}};
//        mda[2][0] = -7;
//        mda[0][0] = 12;
//        mda[2][1] = 16;
//        mda[0][1] = -3;
//        mda[1][0] = 5;

        //Example 1: Find the sum of the first and the last inner array elements. // 12 - 3 -7+16 = 18
//
//         int sum = 0;
//
//        for (int i = 0; i < mda.length; i++) {
//            if (i == 0 || i == mda.length-1) {
//                for (int j = 0; j < mda[i].length; j++) {
//                    sum+= mda[i][j];
//                }
//            }
//        }
//        System.out.println(sum);

        //Type code to find the total amount of elements in the multidimensional array

//        int mda[][] = {{5,2},{11,13,15},{6},{-2,3,5,12}};
//
//
//        int sum =0;
//
//        for (int[] w:mda
//             ) {
//            sum += w.length;
//        }
//        System.out.println(sum);


        //Print the elements which has "a" in it from a multidimensional array.

//        String arr[][]={{"Java","is"},{"easy","to","learn"},{"if","you","study","hard"}};

//        for (String[] w:arr
//             ) {
//            for (String u:w
//                 ) {
//                if (u.contains("a")) {
//                    System.out.print(u + " ");
//                }
//            }
//        }

        //Convert two dimensional array to one dimensional array

//        String arr[][]={{"Java","is"},{"easy","to","learn"},{"if","you","study","hard"}};
//
//        int numOfEl = 0;
//
//        for (String[] w:arr
//             ) {
//            numOfEl+=w.length;
//        }
//
//
//        String brr[] = new String[numOfEl];
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


        int mda[][] = {{5,23},{11,13,15},{6},{-2,3,5,12}};

        // Find the sum of the max and min element in an integer multidimensional array

        int max = 0;
        int min = 0;

        for (int[] w:mda
             ) {
            for (int u:w
                 ) {
                max=Math.max(max,u);
                min = Math.min(min,u);
            }
        }

        System.out.println(min +max);

















    }
}
