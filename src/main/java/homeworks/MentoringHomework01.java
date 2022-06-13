package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class MentoringHomework01 {
    static int length;
    static int startPoint;
    static int maxDiff;
    static int arr[];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        getTheArrayLengthByUser();
        getTheArrayElementsByUser();
        Arrays.sort(arr);
        findTheMinDifferences();
        returnMaxDifference();
        System.out.println("Maks difference and the value: "+ arr[arr.length-1] +"-"+arr[0]+"="+maxDiff);
    }

    public static void getTheArrayLengthByUser(){
        System.out.println("Enter the length of the Array");
        length = input.nextInt();
        arr = new int[length];
    }


    public static void getTheArrayElementsByUser()
    {
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the " +(i+1)+ ". element of the Array");
            arr[i] = input.nextInt();
        }
    }

    public static void findTheMinDifferences(){
        startPoint = arr[1]-arr[0];

        System.out.println("Min difference and the values: ");
        System.out.println(arr[1] + "-" + arr[0] + "=" + (arr[1] - arr[0]));

        for (int i = 1; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] - arr[i] == startPoint ) {
                    System.out.println(arr[j] + "-" + arr[i] + "=" + (arr[j] - arr[i]));
                }
            }
        }
    }


    public static int returnMaxDifference(){
        return maxDiff = arr[arr.length-1]-arr[0];
    }
}
