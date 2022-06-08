package practice_questions.week04;

public class Q03 {
    public static void main(String[] args) {
        /* Type code to ask user to enter the number of row
        and print the shape below according to that number:
         1
         2 3
         4 5 6
         7 8 9 10
         11 12 13 14 15
         16 17 18 19 20 21
         */

        int counter = 1;
        int row = 6;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
