package question_bank2;

import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {
//      Write a Java program to move all 0's to the end of an Array.Maintain the relative order of the other(non-zero) array elements.
        int arr[] = {1,-1,0,9,2,0,8,3,7,4,6,5,0};
        int brr[] = new int[arr.length]; //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        Arrays.sort(arr);

        int idx= 0;
        for (int i=0;i< arr.length;i++) {
            if (arr[i] == 0) {
                continue;
            }
            else {
                brr[idx] = arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));


    }
}
