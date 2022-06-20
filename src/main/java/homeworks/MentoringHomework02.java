package homeworks;
import java.util.Arrays;
import java.util.Scanner;
public class MentoringHomework02 {
    static int m, n;
    static int arr[][];
    static int userAnswer;
   static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        Write a menu driven program to do following operation on two dimensional array A of size m x n.
//        You should use user-defined methods which accept 2-D array A,
//        and its size m and n as arguments. The options are:
//1-To input elements into matrix of size m x n
//2-To display elements of matrix of size m x n
//3-Sum of all elements of matrix of size m x n
//4-To display row-wise sum of matrix of size m x n
//5-To display column-wise sum of matrix of size m x n
//6-To create transpose of matrix of size n x m
        askUserSizeMxN();
        bringMenu();
    }
    public static void askUserSizeMxN()
    {
        System.out.println("Before any further enter the size of matrix m x n ");
            System.out.println("m=?");
            m = input.nextInt();
            System.out.println("n=?");
            n = input.nextInt();
            arr = new int[m][n];
        }
    public static void bringMenu()
    {
        do {
            System.out.println("Enter the number of task that you want to do");
            System.out.println("1-To input elements into matrix of size m x n");
            System.out.println("2-To display elements of matrix of size m x n");
            System.out.println("3-Sum of all elements of matrix of size m x n");
            System.out.println("4-To display row-wise sum of matrix of size m x n");
            System.out.println("5-To display column-wise sum of matrix of size m x n");
            System.out.println("6-To create transpose of matrix of size n x m");
            System.out.println("7-To exit the program");
            userAnswer = input.nextInt();
            bringUserAnswerSwitch();
            if (userAnswer == 7) {
                System.out.println("See you later!!!");
                break;
            }
        }while (true);
    }
    public static void bringUserAnswerSwitch(){
        switch (userAnswer) {
            case 1:
                inputElementToArr();
                break;
            case 2:
                displayArray();
                break;
            case 3:
                sumOfAllElements();
                break;
            case 4:
                rowWiseSum();
                break;
            case 5:
                columnWiseSum();
                break;
            case 6:
                transposeMatrix();
                break;
            case 7:
                break;
            default:
                System.out.println(userInputsInvalidData());
        }
    }
    public static void inputElementToArr(){
        int element = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the "+ element +". element");
                element++;
                int elementOfArray = input.nextInt();
                arr[i][j] = elementOfArray;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
    public static void displayArray(){
        System.out.println(Arrays.deepToString(arr));
    }
    public static void sumOfAllElements(){
        int sum = 0;
        for (int[] w : arr) {
            for (int u : w) {
                sum += u;
            }
        }
        System.out.println(sum);
    }
    public static void rowWiseSum(){
        String rowSum = "";
        for (int[] w : arr) {
            for (int u : w) {
                rowSum += u + " ";
            }
        }
        System.out.println(rowSum);
    }
    public static void columnWiseSum()
    {
        String columnSum = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                columnSum += arr[j][i] + " ";
            }
        }
        System.out.println(columnSum);
    }
    public static void transposeMatrix(){
        int brr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                brr[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    brr[i][j] = arr[j][i];
                }
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static String userInputsInvalidData()
    {
        return "Invalid Input!";
    }
}