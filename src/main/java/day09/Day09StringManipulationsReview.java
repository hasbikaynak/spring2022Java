package day09;

import java.util.Locale;

public class Day09StringManipulationsReview {
    public static void main(String[] args) {
        //Note: in the methods that created by Java, first parameter is always inclusive, second and so on will be exclusive.
        //Count the alphabetical characters in a given String
        //Tom12 Hanks!... ==> 8

        //If your code is just for specific actions or data outputs then your code is called "Hard coding" and it`s not accepted. You should make it "Dynamic".
        //Dynamic code works with every data.

//        String s = "Tom12 Hanks!...";
//
//        int numOfWords = s.replaceAll("[^A-Za-z]","").length();
//
//        System.out.println(numOfWords);

        //Get the initials from full name. (Middle name is out of scope)
        //Tom Hanks ==> TH - tom hanks ==> TH

//        String s = " tom hanks ";
//
//        String initialOfFirstName = s.trim().substring(0,1).toUpperCase(); // T
//        String initialOfLastName = s.trim().split(" ")[1].substring(0,1).toUpperCase(); //H
//
//        System.out.println( initialOfFirstName + initialOfLastName);

        //Fix the day names format like "Sunday".
        //If user gives you "sunday" ==> "Sunday" - "SUNDAY" ==> "Sunday" - "  sUNDAY   " ==> "Sunday"

//        String s = " sUNDAY ";
//
//        String firstInitial = s.trim().substring(0,1).toUpperCase(); // S
//        String restOfCharacters = s.trim().substring(1).toLowerCase(); // unday
//
//        System.out.println(firstInitial + restOfCharacters);

        // Make the all digits except from last 4 digits of a credit card invisible by using '*'
        //1234 1234 1234 1234 ==> **** **** **** 1234

//        String s = "1234 1234 1234 1234";
//
//
//        String last4Digits = s.trim().split(" ")[3]; // 1234
//        String convertedNumbers = s.trim().substring(0,15).replaceAll("\\S","*"); // **** **** ****  \\S means ^space \\s means space
//        System.out.println(convertedNumbers + last4Digits);

        /*
      *********** EBAY Interview Question *********** Type code to print just the unique characters in a String
        "Hello" ==> Heo
        * if indexOf() != lastIndexOf() then it`s not unique
        * */

//        String s = "Hello";
//
//        boolean isEqualToEachOtherIndex0 = s.indexOf(s.charAt(0)) == s.lastIndexOf(s.charAt(0));
//        if (isEqualToEachOtherIndex0){
//            System.out.println(s.charAt(0));
//        }
//        boolean isEqualToEachOtherIndex1 = s.indexOf(s.charAt(1)) == s.lastIndexOf(s.charAt(1));
//        if (isEqualToEachOtherIndex1){
//            System.out.println(s.charAt(1));
//        }
//        boolean isEqualToEachOtherIndex2 = s.indexOf(s.charAt(2)) == s.lastIndexOf(s.charAt(2));
//        if (isEqualToEachOtherIndex2){
//            System.out.println(s.charAt(2));
//        }
//        boolean isEqualToEachOtherIndex3 = s.indexOf(s.charAt(3)) == s.lastIndexOf(s.charAt(3));
//        if (isEqualToEachOtherIndex3){
//            System.out.println(s.charAt(3));
//        }
//        boolean isEqualToEachOtherIndex4 = s.indexOf(s.charAt(4)) == s.lastIndexOf(s.charAt(4));
//        if (isEqualToEachOtherIndex4){
//            System.out.println(s.charAt(4));
//        }

        //Type a code to find the number of punctuation marks used in a String.

//        String s = "Wow!... Ali is 13 years old, and he is a university student)(";
//       int countOfPunctuationNumbers=  s.replaceAll("[^\\p{Punct}]","").length(); // !@#$%^&*()
//        System.out.println(countOfPunctuationNumbers);


        //Create a method prints greetings by using the given name
        //Ali ==> Hi Ali      Tom ==> Hi, Tom
        System.out.println(greetingUser("Anan"));
        System.out.println(limitDecimalPart(12.12345656567f));


            }
            public static String greetingUser(String name){
            return String.format("Hi %s",name);
            }

            public static String limitDecimalPart(float num)
            {
                return String.format("The price is %.5f",num);
            }
}
