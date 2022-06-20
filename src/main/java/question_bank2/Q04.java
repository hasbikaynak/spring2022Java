package question_bank2;

import java.util.Arrays;

public class Q04 {
    public static void main(String[] args) {
//        Write a program to find the length of the longest consecutive elements sequence from a given unsorted array of integers.
        //sample array: {49,1,3,200,2,4,70,5};
        //the longest consecutive elements sequence is [1,2,3,4,5] , therefore the program will return its length 5.

        int arr[] = {49,1,3,200,2,6,7,4,70,5};

        Arrays.sort(arr); //[1,2,3,4,5,49,70,200]

        String s = "";
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]-1 || arr[i] == arr[i-1]+1) {
                s+=arr[i];
            }
        }
        int length=s.length();
        System.out.println(length);

    }
}
