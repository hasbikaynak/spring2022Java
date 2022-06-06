package practice_questions.week03;

public class Q04 {
    public static void main(String[] args) {
        /*
   Get the number of rows from user then draw a right triangle by using asterixs
   Number of rows = 4 ==>    *
                             * *
                             * * *
                             * * * *
   */

        int row = 4;


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
