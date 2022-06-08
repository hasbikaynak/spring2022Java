package homeworks;

import java.util.Arrays;
import java.util.Comparator;

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















    }
}
