package practice_questions.week04;

import java.util.Arrays;

public class Q04 {
    public static void main(String[] args) {
        //Type a method to change the sign(+-) of the elements in a given array.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6

        int arr[] ={1,2,-3,4,-5,-6};
        int brr[] =new int[arr.length];

        int idx = 0;
        for (int w: arr
             ) {
            brr[idx] = -1 * w;
            idx++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }
}
