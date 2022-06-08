package practice_questions.week04;

public class MultidimensialArray {
    /*Question No 1:
  declare and create a two-dimensional array of integers numbers with the numbers (1,2,3) in the first row, the numbers (4,5,6) in the second row,
   and the numbers (7,8,9) in the third row. Then loop through the two-dimensional array,
    printing out the values in the first row followed by those in the second row and so on.*/

    public static void main(String[] args) {


        //Problem No:1

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("++++++++++++++++++++++++++++++++");


        //Problem No:2





    }
}
