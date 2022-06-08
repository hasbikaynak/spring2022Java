package practice_questions.week04;

import java.util.Arrays;

public class Q05 {
    public static void main(String[] args) {
        /*
          Type code to find the minimum, maximum and second-maximum number in the array?
          input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
          output: min:-90, max:10001, secMax: 8787
         */
         int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

         //I. way
//        Arrays.sort(arr);
//
//       int minValue = arr[0];
//       int maxValue = arr[arr.length-1];
//       int secondMaxValue = arr[arr.length-2];
//
//        System.out.println(Arrays.toString(arr));
//        System.out.println("min: " + minValue + ", max: " + maxValue + ", secMax: " +secondMaxValue);

        //II. way
        int min=0;
        int max=0;
        int secMax=0;
        for (int w:arr
             ) {
            if (w < min) {
                min=w;
            }
            if (w > max) {
                secMax=max;
                max=w;
            }
            else if (w>secMax) {
                secMax=w;
            }
        }
        System.out.println("min: " + min + ", max: " + max + ", secMax: " +secMax);


    }
}
