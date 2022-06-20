package practice_questions.week05;

import java.util.Arrays;

public class Q11 {
    public static void main(String[] args) {
        /*
    ) Find the middle element in an integer array
        Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
     */
        int arr[] = {12,5,8,11};
        Arrays.sort(arr);
        int length = arr.length;
        int middle = arr.length/2;
            if (length %2 != 0) {
                System.out.println(arr[middle]);
            }
            else {
                System.out.println((arr[middle]+arr[middle-1])/2);
            }


    }
}
