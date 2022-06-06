package practice_questions.week03;

public class Q03 {
    public static void main(String[] args) {
        /*
    Type code to ask user to enter an integer to check if it is 'Perfect Number' or not.'
    A perfect number is a positive integer that is equal to the sum of all its proper divisors.
    6 = 1+2+3, 28 = 1 + 2 + 4 + 7 + 14, (496 and 8128)
     */

        int num = 496;

        int dividers = 0;
        for (int i = 1 ; i < num; i++) {

            if (num %i==0) {
                dividers += i;
            }
        }
        if (dividers == num) {
            System.out.println("It`s perfect number");
        }
        else {
            System.out.println("It`s not perfect number");
        }
    }
}
