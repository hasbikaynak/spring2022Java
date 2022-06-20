package question_bank2;

import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {
        //arr[] = {0,1,1,0,1,1,0,1,0,0}
        //output: after sorting: [0,0,0,0,0,1,1,1,1,1]

        int arr[] = {0,1,1,0,1,1,0,1,0,0};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
