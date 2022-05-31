import java.time.LocalDateTime;
import java.util.Scanner;

public class Day10ForLoopReview {
    public static void main(String[] args) {
        // Ask user to enter his/her full name, then create a unique ID for the user
        //ID should contain first 2 characters of the first name and last 2 characters of the last name.
        //Use the current date time at the end of the id
        //Tom Hanks ==> id = Toks20220528110434

//        String s = "Tom Hanks";
//
//        String first2Chars = s.substring(0,2); // To
//        int indexOfLast2Chars = s.length()-2;
//        String last2Chars =   s.substring(indexOfLast2Chars); //ks
//
//        LocalDateTime localDateTime = LocalDateTime.now(); // 2022-05-29T12:54:11.024748
//        String localDateTimeString = localDateTime.toString();
//
//        String dateHourMinSec  = localDateTimeString.substring(0,19).replaceAll("\\D",""); //20220529125646
//
//        System.out.println( first2Chars + last2Chars + dateHourMinSec); //Toks20220529125725

        // Print all integers from 10 to 32 except from 17 on the console

//        for (int i = 10; i < 33; i++) {
//            if (i == 17) {
//                continue;
//            }
//            System.out.println(i);
//        }


        //Type String characters one by one on the console if u see the "x" in the String value, stop printing
        //Publix is the best  ==> Publi

//        String s = "Publix is the best";
//
//        for (int i = 0; i < s.length(); i++) {
//
//            if (s.charAt(i) == 'x') {
//                break;
//            }
//            System.out.print(s.charAt(i));
//        }

        //Type code to print the following image on the console
        //          X X X X X
        //          X X X X X
        //          X X X X X


//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter row quantity");
//        int row = input.nextInt();
//
//        System.out.println("Enter column quantity");
//        int column = input.nextInt();
//
//        for (int i = 0; i < row; i++) {
//            String s = "";
//            for (int j = 0; j < column; j++) {
//                s+= " X";
//            }
//            System.out.println(s);
//        }

        /*
              Week: 1
                Day: 1
                Day: 2
                Day: 3

              Week: 2
                Day: 1
                Day: 2
                Day: 3
          */

//        int week = 4;
//        int day = 5;
//
//        for (int i = 1; i < week+1; i++) {
//            System.out.println("Week:" +" "+ i);
//            for (int j = 1; j < day+1; j++) {
//                System.out.println("Day:" +" "+ j);
//
//            }
//        }

        // Find the sum of the digits of decimal part in a double number
        // 23.1528 ==> 1+5+2+8 = 16

//        double d = 23.1528;
//
//        String ds = String.valueOf(d);
//        String dsDecimal = ds.split("\\.")[1]; //1528
//        int dsDouble = Integer.parseInt(dsDecimal);
//        int sum = 0;
//
//        for (int i = dsDouble; i > 0 ; i/=10) {
//            sum += i%10;
//        }
//        System.out.println(sum);

        //Ask user to enter first name, middle name and last name as one single String, then print the first character of middle name and last name.
        //e.g. Mark Hansel Twain==> HT

//        String name = "Mark Hansel Twain";
//
//        String firstCharOfMiddleName = name.split(" ")[1].substring(0,1).toUpperCase(); // H
//        String firstCharOfLastName = name.split(" ")[2].substring(0,1).toUpperCase(); // T
//        System.out.println(firstCharOfMiddleName + firstCharOfLastName);


        /*
        * Ask user to enter two words. If the number of characters of the first word is even, then put the second word into the middle of the first word.
		 If the number of characters of second word is odd, then print on console "You can not put second word into the middle of the first word. Because it's number of character is odd.".
		 * */

//        String s = "Mehmet Hasbi";
//        String firstWord = s.split(" ")[0]; // Mehmet
//        String secondWord = s.split(" ")[1]; // Hasbi
//
//        String firstHalf=  firstWord.substring(0,firstWord.length()/2); // Meh
//        String secondHalf = firstWord.substring(firstWord.length()/2); // met
//
//
//        if (firstWord.length() %2 == 0) {
//            System.out.println( firstHalf + secondWord + secondHalf);
//        }
//        else {
//            System.out.println("You can not put second word into the middle of the first word. Because it's number of character is odd.");
//        }

        //Print the characters of all numbers between 0-255

//        for (char i = 0; i < 256; i++) {
//            System.out.print(i);
//        }

        //Ask user to enter a String and count the number of 'a's come earlier than first occurrence of 'c'.

//        String s = "aaaaaaacaa";
//        int counter = 0;
//
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'c') {
//                break;
//            }
//            counter++;
//        }
//        System.out.println(counter);
























    }
}
