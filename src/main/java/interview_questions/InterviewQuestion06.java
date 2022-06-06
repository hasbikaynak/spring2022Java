package interview_questions;

import java.util.Arrays;

public class InterviewQuestion06 {
    public static void main(String[] args) {
        // [0, 2, 3, 0, 12, 0] put the zeros to the end

        int arr[] = {0, 2, 3, 0, 12, 0};

        int newArr[] = new int[arr.length]; // [0 ,0 ,0 ,0 ,0 ,0]

        int idx = 0;

        for (int i=0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[idx] = arr[i]; // [2 ,3 ,12 ,0 ,0 ,0]
            idx++;
            }
        }
        System.out.println(Arrays.toString(newArr)); //[2 ,3 ,12 ,0 ,0 ,0]
    }
}
