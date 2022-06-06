package practice_questions.week03;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //Print numbers from given number till the next multiple of 10. e.g.,
        // 6 ==> 6,7,8,9

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        while(num %10!=0)
        {
            System.out.print(num + " ");
            num++;
        }
    }
}
