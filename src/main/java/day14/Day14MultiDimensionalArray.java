package day14;

import java.util.Arrays;

public class Day14MultiDimensionalArray {
    public static void main(String[] args) {
        int arr[][] = new int[4][3]; //length of outer array and length of inner array
        arr[2][1]=5;  //first outer length and second inner length


        //deepToString() in order to print multidimensional arrays
        System.out.println(Arrays.deepToString(arr));
    }
}
