package question_bank2;

public class Q01 {
//    Write a Java program to print the following grid.
//    Expected  Output:
    // ----------
    // ----------
    // ----------
    // ----------
    // ----------
    // ----------
    // ----------
    // ----------
    // ----------
    // ----------
    //10 row - 10 column
    public static void main(String[] args) {
        int column = 10;
        int row = 10;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}
