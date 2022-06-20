package practice_questions.week07;
import java.util.Arrays;
public class Q06 {
    public static void main(String[] args) {
        //Type a method to check if an int Array is symmetrical or not.
        int[] arr = {0,1,2,3,2,1,0};



        checkIfSymmetrical(arr);
    }
    public static void checkIfSymmetrical(int[] arr)
    {
        int[] brr = new int[arr.length];
        for (int i = arr.length-1; i > -1; i--) {
            brr[i]=arr[i];
        }
        boolean isEquals = Arrays.equals(arr, brr);
        if (isEquals) {
            System.out.println("Symmetrical");
        }
        else {
            System.out.println("Not symmetrical");
        }
    }
}
