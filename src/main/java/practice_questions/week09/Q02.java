package practice_questions.week09;

public class Q02 {
    public static void main(String[] args) {
        /*
   Take the number of rows from user and print on console the shape based on rows.
                  *
                 * *
                * * *
               * * * *
              * * * * *
    */
        int row = 5;
        for (int i = 0; i < row; i++) {

            for (int space = row - i; space > 1; space--) {
                System.out.print(" ");
            }
            for (int asterix = 0; asterix <= i; asterix++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
