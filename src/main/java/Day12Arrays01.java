import java.util.Arrays;
import java.util.Scanner;

public class Day12Arrays01 {
    public static void main(String[] args) {

        /*
        * Arrays are for storing multiple data
        * An array can have just a single data type
        * Arrays can store just primitive data types or references of non-primitives
        * An array can not have non-primitive data types in it.
        * When you create an array you have to declare its length(Number of elements)
        * Array uses indexes. In order to reach to the first element you should type 0
        * */

        //how to create an Array
//        int ages[] = new int[4];
//
//
//        //how to print an array on the console
//
//        System.out.println(Arrays.toString(ages));
//
//
//        //How to assign values to array elements
//       //I.way -- not good
//        ages[0] = 12;
//        ages[1] = 20;
//        ages[2] = 11;
//        ages[3] = 9;
//
//        //II. way -- very good recommended
//        int age1[] = {1,2,3,4};
//
//
//        System.out.println(Arrays.toString(ages));
//
//
//        //How to print array elements one by one
//
//        System.out.println(ages[2]);
//
//
//        //Print the sum of the ages array elements on the console
//
//        //I. way -- not good
//        System.out.println(ages[0] + ages[1] + ages[2] + ages[3]);
//
//        //II. Way -- very good and recommended
//
//        int sum = 0;
//        for (int i = 0; i < ages.length; i++) {
//            sum+=ages[i];
//        }
//        System.out.println(sum);
//
////How to create an array and assign values in short way
//        String names[] = {"Tom","Jimmy","Alex","Karl"};
//        System.out.println(Arrays.toString(names)); // [Tom,Jim,Alex,Karl]
//
//        //Find the total number of characters in array elements
//        int sum1= 0;
//        for (int i = 0; i < names.length; i++) {
//            sum1+=names[i].length();
//        }
//        System.out.println(sum1);

        //Type code to print the sum of the min and max value of an integer array.

//        int arr[] = {23, 12, 34, 10, 78, 19};
//
//        //put the elements in ascending order
//
//        Arrays.sort(arr);
//
//        System.out.println(Arrays.toString(arr));
//
//        int minValue = arr[0];
//
//        int maxValue = arr[arr.length-1];
//
//        System.out.println(maxValue + minValue);






        //Create a String array by getting elements from user
        //Type code to put elements in alphabetical order
        //Type code to print the total number of characters in the first and the last String.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the number of elements you want to store in the array");
//        int length = input.nextInt(); //5
//
//        String arr[] = new String[length]; //arr[5]
//
//        for (int i = 0; i < length; i++) {
//            System.out.println("Enter the " + (i+1) + ". element");
//            arr[i] = input.next().toLowerCase();
//        }
//
//        System.out.println(Arrays.toString(arr));//[ali, ahmet, ayse, mehmet, ahsen]
//
//        //sort() method puts the String elements in alphabetical order
//        Arrays.sort(arr);
//
//        System.out.println(Arrays.toString(arr)); //[ahmet, ahsen, ali, ayse, mehmet]
//
//        int numOfCharsInFirstElement = arr[0].length(); // ahmet ==>5
//        int numOfCharsInLastElement = arr[arr.length-1].length(); // mehmet ==> 6
//
//        System.out.println(numOfCharsInFirstElement + numOfCharsInLastElement); // 11


        /************************interview question************************/
        // [0, 2, 3, 0, 12, 0] put the zeros to the end

//        int arr[] = {0, 2, 3, 0, 12, 0};
//
//        int newArr[] = new int[arr.length];
//
//        int idx = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                newArr[idx] = arr[i];
//                idx++;
//            }
//        }
//        System.out.println(Arrays.toString(newArr));


//        Create an integer array and print all the elements less than 5
        // [12, 3, -3, 5, 23]  ==> 3,-3
        int arr[] = {12, 3, -3, 5, 23,0,1,2,3};
        //I. way: use regular while loop
        int i=0;
        while (i< arr.length){
            if (arr[i] < 5) {
                System.out.print(arr[i] + " ");
            }
            i++;
        }

        System.out.println("");
        //II. way : use for-each loop(Enhanced Loop) // can be used just with the arrays and collections.
        for (var w : arr) {

            if (w < 5) {
                System.out.print(w + " ");
            }
        }



























    }
}
