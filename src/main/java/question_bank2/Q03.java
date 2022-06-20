package question_bank2;

public class Q03 {
    public static void main(String[] args) {
        //Write a Java program to check if the sum of all the 10's in the Array is exactly 30. Return false if the condition does not satisfy, otherwise true.

        int arr[] = {10,10,10,10,2,30,45,2,56,0};

        int sum = 0;
        for (int w:arr) {
            if (w==10){
                sum+=w;
            }
        }
        boolean is30= sum == 30;
        if (is30) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
