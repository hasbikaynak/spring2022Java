package day14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Day14ForEachLoop01 {
    public static void main(String[] args) {
        //Type code to check if 2 given arrays have exactly the same elements.
        //arr[] = [12,3,-5,14]       brr[] = [14, -5, 12 ,3]
        // Arrays Class has a method to check if 2 given arrays are the same(Elements and orders are same) or not
        // [12,4,-1] != [12,-1,4]                  [12,4,-1] == [12,4,-1]


//        int arr[] = {12 ,3 ,-5 ,14};
//        int brr[] = {14 ,-3 ,12 ,3};
//
//        Arrays.sort(arr); // [-5 ,3 , 12, 14]
//        Arrays.sort(brr); // [-5 ,3 , 12, 14]
//
//       boolean isEqual = Arrays.equals(arr,brr);
//
//        System.out.println("Are the arrays same? " + isEqual);


        // Type code to check if a specific element exists in an array or not

//        String crr[] = {"Java","Selenium","Api","Sql"};
//
//        String expectedElement = "anan"; //using of Flag : to check if a specific scenario occurred in an array or not
//        int counter = 0;
//        for (var w:crr
//             ) {
//            if (w.equals(expectedElement)) {
//             counter++;
//             break;
//            }
//        }
//        if (counter > 0) {
//            System.out.println("The array has the expected element");
//        }
//        else {System.out.println("The array does not has the expected element");}

        //Type code to check if the number is used of specific element in an array

        //[12, 2, 23, -5, 12, 23, 12] ==> 12 was used 3 time
        // ==> -5 was used 1 time

//        int arr[]= {12,2,23,-5,12,23,12};
//
//        int specificValue = 12;
//
//        int counter = 0;
//
//        for (var w: arr
//             ) {
//            if (w == specificValue) {
//                counter++;
//            }
//        }
//        System.out.println(specificValue + " was used " + counter +" times in the array");



          /**Important**/

//Sort the array elements according to their lengths.
        //"Michael", "Ali","Maria","Veli" ==> "Ali" - "Veli" - "Maria" - "Michael"

//        String arr[] = {"Michael", "Ali","Maria","Veli"};
//        System.out.println(Arrays.toString(arr));
//
//
//        Arrays.sort(arr, Comparator.comparingInt(String::length));
//        System.out.println(Arrays.toString(arr));

        //Sort the array elements according to their lengths.
        //"Michael", "Ali","Maria","Veli" ==> "Michael","Maria" , - "Veli" ,-"Ali"


//        String arr[] = {"Jackson", "Tom", "Dustin", "Mary","Mary"};
//        Arrays.sort(arr,Comparator.comparingInt(String::length).reversed()); // Descending order
//
//        System.out.println(Arrays.toString(arr));


        //Sort the array elements in descending order according to their lengths.
        //If some elements are in the same length put them in alphabetical order

//        String arr[] = {"Jack", "Mark","Adam" , "Jackson" ,"Marry","Junior Thomson"};
//
/** impartant2 */
//        Arrays.sort(arr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder())); // descending order + alphabetical and ascending order
//        //natural order means alphabetical order for strings and ascending order in numbers


        //Check if the array elements are in the natural order. "A", "B", "C" ==> true  , "A" , "C" , "B" ==> false

        //String arr[] = {"A", "B", "C", "D" , "E"};

        //How to create a copy of the given array




        //I. way by using loops
//        String copyOfArray[] = new String[arr.length]; // [null,null,null]
//
//        int idx = 0;
//        for (String w:arr
//             ) {
//            copyOfArray[idx] = w;
//            idx++;
//        }
//        System.out.println(Arrays.toString(copyOfArray)); // [A, C, B]

//        String copyOfArray[] = Arrays.copyOf(arr,arr.length); //copyOfArray() method
//
//        Arrays.sort(copyOfArray); //[A , B , C]
//
//        boolean isEquals = Arrays.equals(arr,copyOfArray);
//
//        if (isEquals) {
//            System.out.println("Array elements are in alphabetical order");
//        }
//        else {
//            System.out.println("Array elements are not in alphabetical order");
//        }


        //binarySearch() method in Arrays Class : it is used to check existence of an element in an array
//
//        int arr[] = {12,13,5,11,-2};
//
//        //it is a must to be able to get meaningful from binarySearch()
//        Arrays.sort(arr);
//
//        int response = Arrays.binarySearch(arr,13); //binarySearch() returns the index, if the element exists.
//        System.out.println(response);
//
//        int response1 = Arrays.binarySearch(arr,14);//will get -6 for 14. i)"-" means 14 does not exist
//                                                         //                    ii) "6" means if 14 would exist it would be the 6.th element


        //Check if a specific element exists in an Array.
        //if the element exists return the index of the element
        //if the element does not exist return a message

//        int arr[] = {13,41,2,543};
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the element to check if it exists or not");
//        int i = scan.nextInt();
//
//        Arrays.sort(arr);
//         int response3 = Arrays.binarySearch(arr,i);
//
//        if (response3<0) {
//            System.out.println(i+ " Element does not exist");
//        }
//        else {
//            System.out.println("Index of the element "+ i +" is "+ response3);
//        }


        //find the longest word in a String
        String sentence = "Java is easy if you study. Actually 12345678 nothing is easy if you do not study.";

        //replaceAll the punctuation marks.
        //put every word in an array ==> [Java, is, easy, if, you, study, Actually, nothing, is, easy, if, you, do, not, study,]
        //sort the array elements according to the length ==> [is, is,if,if,do,not,you,you,easy,easy,Java,study,study,nothing,Actually]
        //last element will be the longest one


        String sentenceWithoutPunctuation = sentence.replaceAll("\\p{Punct}",""); // Java is easy if you study Actually nothing is easy if you do not study

        String arrWords[] = sentenceWithoutPunctuation.split(" "); // split method returns an Array //[Java, is, easy, if, you, study, Actually, nothing, is, easy, if, you, do, not, study]

        Arrays.sort(arrWords,Comparator.comparingInt(String::length).reversed());
        System.out.println(arrWords[0]);

        //How to see all the longest elements if there are many longest elements

        for (String w:arrWords
             ) {
            if (w.length() == arrWords[0].length()) {
                System.out.print(w+ " ");
            }
        }





























    }
}
