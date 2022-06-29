package practice_questions.week08;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
       int[] arr = {1,23,34,22,89,23,23};

       Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));//[1, 22, 23, 23, 23, 34, 89]

        int secondMax = arr[arr.length-2];

        System.out.println(secondMax);
    }
}
