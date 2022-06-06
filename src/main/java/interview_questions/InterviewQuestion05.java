package interview_questions;

public class InterviewQuestion05 {
    public static void main(String[] args) {
        /* ************************Very common interview question *******************************
        Ask the user how many fibonacci numbers he wants to see. Then write the code that prints these fibonacci numbers.
        Example: if user enters 6 output will be 1 1 2 3 5 8
        *  */
        int i = 6;

        int num1 = 1;
        int num2 = 1;
        int num3 = 0;

        System.out.print(num1 + " ");
        System.out.print(num2 + " ");

        for (int j = 0; j < i-2; j++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");
        }

    }
}
