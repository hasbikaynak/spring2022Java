package question_bank2;

import java.util.Arrays;

public class Q07 {
    public static void main(String[] args) {
        //Write a Java program to find Longest Bitonic Subarray in a given array. A bitonic subarray is a subarray of given array where elements are first sorted in increasing order,
        //then in decreasing order. A strictly increasing or strictly decreasing subarray is also accepted as bitonic subarray.
        //example : inpute: array = {4,5,9,5,6,10,11,9,6,4,5} ==> output
        //the longest bitonic subarray is [3,9]
        // elements of the said sub-array: 5 6 10 11 9 6 4
        //the length of longest bitonic subarray is 7

        int arr[] = {4,5,9,5,6,10,11,9,6,4,5};
        System.out.println("Original Array: "+ Arrays.toString(arr));

        int incre_arr[] = new int[arr.length];
        incre_arr[0]=1;
        for (int i = 1; i < arr.length; i++) {
            incre_arr[i]=1;
            if (arr[i-1] < arr[i]) {
                incre_arr[i] = incre_arr[i-1]+1;
            }
        }
        int decre_arr[] = new int[arr.length];
        decre_arr[arr.length-1]=1;
        for (int i = arr.length-2; i >= 0 ; i--) {
            decre_arr[i]=1;
            if (arr[i] > arr[i+1]){
                decre_arr[i] = decre_arr[i+1]+1;
            }
        }
        int lbs_len = 1;
        int start = 0,finish=0;
        for (int i = 0; i < arr.length; i++) {
            if (lbs_len < incre_arr[i] + decre_arr[i]-1) {

                lbs_len = incre_arr[i] + decre_arr[i]-1;
                start= i - incre_arr[i]+1;
                finish = i + decre_arr[i]-1;
            }
        }
        System.out.println("The longest bitonic subarray is: "+ start+ "," + finish );
        System.out.print("Elements of the said sub-array: ");
        for (int x = start; x <= finish; x++)
        {

            System.out.print(arr[x]+" ");
        }
        System.out.println("The length of longest bitonuc subarray is " + lbs_len);

    }
}
