package interview_questions;

public class InterviewQuestion09 {
    public static void main(String[] args) {
        //A Prime Number
        // Write a Java program to check if a given number is prime or not. Remember, a prime number is a number which is not divisible by any other number,
        // e.g. 3, 5, 7, 11, 13, 17, etc. Be prepared for cross, e.g. checking till the square root of a number, etc.


        int num = 38;

        int counterPrime = 0;
        int counterNotPrime = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                counterNotPrime++;
            }
            else {
                counterPrime++;
            }
        }
        if (counterNotPrime > 0) {
            System.out.println("not a prime");
        }
        else {
            System.out.println("prime");
        }
    }
}
