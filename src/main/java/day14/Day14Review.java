package day14;

import java.util.Arrays;
import java.util.Comparator;

public class Day14Review {
    public static void main(String[] args) {
        //Type code to check if 2 given arrays have exactly the same elements.
//
//        String arr[] = {"Anne","Baba","Dede"};
//        String brr[] = {"Anne","Baba","Dede"};
//
//        int flag = 0;
//
//        for (String w: arr
//             ) {
//            if (Arrays.equals(arr,brr)) {
//                flag++;
//            }
//        }
//        if (flag > 0) {
//            System.out.println("Both arrays are the same");
//        }
//        else {
//            System.out.println("Arrays that given does not have the same elements");
//        }


        // Type code to check if a specific element exists in an array or not

//
//        String arr[] = {"Mommy","Daddy","Granny"};
//
//        String specificElement = "Mommy";
//
//        int flag = 0;
//        for (String w:arr
//             ) {
//            if (w == specificElement) {
//                flag++;
//                break;
//            }
//        }
//
//        if (flag > 0) {
//            System.out.println("It does contains the given specific element");
//
//        }
//        else{
//            System.out.println("It does not contains the given specific element");
//        }


        //Type code to check if the number is used of specific element in an array

        //[12, 2, 23, -5, 12, 23, 12] ==> 12 was used 3 time
        // ==> -5 was used 1 time


//        int arr[] = {12, 2, 23, -5, 12, 23, 12};
//
//        int specificElement = 12;
//
//        int counter = 0;
//        for (int w:arr
//             ) {
//            if (w == specificElement) {
//                counter++;
//            }
//        }
//
//        if (counter > 0) {
//            System.out.println(specificElement + " is used " + counter +" times in the given array");
//        }
//        else {
//            System.out.println(specificElement + " is not used in the given array");
//        }



        //Check if the array elements are in the natural order. "A", "B", "C" ==> true  , "A" , "C" , "B" ==> false

//        String arr[] = {"B","C","D"};
//
//        String copyOfArr[] = new String[arr.length]; // [null,null,null]
//
//        int idx = 0;
//        for (String w: arr
//             ) {
//            copyOfArr[idx] = w;
//            idx++;
//        }
//
////        System.out.println(Arrays.toString(copyOfArr)); // [A, B, C]
//
//        Arrays.sort(copyOfArr); // [A, B, C]
//
//       boolean isEquals = Arrays.equals(arr,copyOfArr);
//
//        System.out.println("Are the array`s elements in the natural order? : " +isEquals);


        //Check if a specific element exists in an Array.
        //if the element exists return the index of the element
        //if the element does not exist return a message

//        int arr[] = {13,41,2,543};
//
//        int specificElement = 13;
//
//        Arrays.sort(arr);
//
//        int index = Arrays.binarySearch(arr,specificElement);
//
//        if (index > -1 ) {
//            System.out.println("Specific element is in the Array and it`s sorted index number is: "+ index); // 0
//        }
//        else {
//            System.out.println("Specific element is not in the Array");
//        }



        //find the longest word in a String
        String sentence = "Java is easy if you study. Actually nothing is easy if you do not study.";

        //replaceAll the punctuation marks.
        //put every word in an array ==> [Java, is, easy, if, you, study, Actually, nothing, is, easy, if, you, do, not, study,]
        //sort the array elements according to the length ==> [is, is,if,if,do,not,you,you,easy,easy,Java,study,study,nothing,Actually]
        //reverse the array elements
        //last element will be the longest one

        sentence.replaceAll("\\p{Punct}","");
        String arr[] = sentence.split(" ");

        Arrays.sort(arr, Comparator.comparingInt(String::length).reversed());

        System.out.println(arr[0]);































    }
}
