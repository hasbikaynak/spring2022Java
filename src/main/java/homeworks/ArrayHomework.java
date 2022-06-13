package homeworks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayHomework {
    public static void main(String[] args) {
        /*Find the middle element in an integer array
Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
 (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
*/
//        int arr[] = {12,5,8,3,45,56,5,6};
//
//        Arrays.sort(arr);
//
//        if (arr.length %2 != 0) {
//            int indexOfElement = arr.length/2;
//            System.out.println(arr[indexOfElement]);
//        }
//        else {
//            int indexOfElement = arr.length/2;
//            int averageValue = (arr[indexOfElement] + arr[indexOfElement-1])/2;
//            System.out.println(averageValue);
//        }

        /*Find the smallest positive element and greatest negative element in an integer array
Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2
*/

//        int arr[] = {-12, 18, -5, 23, -2};
//
//        Arrays.sort(arr); //[-12, -5, -2, 18, 23]
//
//        int smallestPositiveElement=arr[arr.length-1];
//        int greatestNegativeElement=arr[0];
//
//        for (int w:arr
//             ) {
//            if (w >= 0) {
//               smallestPositiveElement = Math.min(smallestPositiveElement,w);
//            }
//            if (w < 0) {
//                greatestNegativeElement = Math.max(greatestNegativeElement,w);
//            }
//        }
//        System.out.println("Smallest Positive Element: " + smallestPositiveElement);
//        System.out.println("Maximum Negative Element: " + greatestNegativeElement);


        /*Find the elements whose length is the smallest in a String array
Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
*/

//        String arr[]={"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
//
//        Arrays.sort(arr, Comparator.comparingInt(String::length));
//
//
//        System.out.println(Arrays.toString(arr)); //[Mark, Veli, Kemal, Angie, Jonathan]
//
//        int firstValueLength = arr[0].length(); // 4
//
//
//        for (var w:arr
//             ) {
//            if (w.length() == firstValueLength) {
//                System.out.print(w + " ");
//            }
//        }

        //Count how many words start with 'a' or 'A' in a given String

//        String s = "Apex is an object oriented programming language";
//
//        String arr[] =  s.split(" ");
//
//        int counter = 0;
//        for (String w:arr
//             ) {
//            if (w.startsWith("A") || w.startsWith("a"))
//            {
//                counter++;
//            }
//        }
//        System.out.println(counter);

//        Find the number of vowels in a String
//        String s = "Apex is an object oriented programming language";
//        String[] arr = s.toLowerCase().split("");
//        int counter = 0;
//        for(String w : arr){
//            switch(w){
//                case "a":
//                case "e":
//                case "i":
//                case "o":
//                case "u":
//                    counter++;
//            }
//        }
//        System.out.println("The number of vowels is " + counter);

//        Type code to find array elements whose first and last characters are same
//          String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
//
//        for (String w:arr
//             ) {
//           String startsWith = w.substring(0,1);
//           String endsWith = w.substring(w.length()-1);
//
//            if (startsWith.equals(endsWith)) {
//                System.out.print(w +" ");
//            }
//        }

//        Type code to find if a given element exists in a given array or not
//        String[] arr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
//        String s = "OBject";
//
//        for (String w:arr
//             ) {
//            if (w.equalsIgnoreCase(s)) {
//                System.out.println("Given element is exists in the array");
//                break;
//            }
//        }

//        Type code to find sum of the number of characters of array elements
//        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
//        int sum = 0;
//        for (String w:arr) {
//            sum += w.length();
//        }
//        System.out.println(sum);

   //     Type code to put all zeros to end in an integer array.
   //     Example: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
//        int arr[] = {5, 0, 2, 0, 3};
//        int brr[] = new int[arr.length]; //[0,0,0,0,0]
//
//        int idx=0;
//        for (int w:arr
//             ) {
//            if (w == 0) {
//                continue;
//            }
//            else {
//                brr[idx] = w;
//                idx++;
//            }
//        }
//
//        System.out.println(Arrays.toString(brr));

//        Create an integer array by getting the elements from the user then print the difference
//between the smallest and the greatest elements on the console.


//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the array length");
//        int length = input.nextInt();
//        int arr[] = new int[length];
//        for (int i = 0; i < length; i++) {
//            System.out.println("Enter " +(i+1)+ ". element");
//            arr[i]=input.nextInt();
//        }
//        Arrays.sort(arr);
//        int smallestElement = arr[0];
//        int greatestElement = arr[arr.length-1];
//
//        System.out.println(greatestElement - smallestElement);
//

//        Ask the user to enter 2 Strings. If the characters and the numbers of characters of the
//Strings are the same then print "Anagram" on the console. Otherwise, print "Not Anagram"
//on the console. Ignore cases. For example; "Mary" and "army" and "RAMY" are Anagrams.
        Scanner input = new Scanner(System.in);
        System.out.println("enter first String");//Mary
        String stringNum1 = input.next();
        String arr[] = stringNum1.toLowerCase().split("");
        Arrays.sort(arr);
        System.out.println("enter second String");//army
        String stringNum2 = input.next();
        String brr[] = stringNum2.toLowerCase().split("");
        Arrays.sort(brr);
        if (stringNum1.length() != stringNum2.length()) {
            System.out.println("Not Anagram");
        } else if (stringNum1.isEmpty()||stringNum2.isEmpty()) {
            System.out.println("Not Anagram");
        } else if (Arrays.equals(arr,brr)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
