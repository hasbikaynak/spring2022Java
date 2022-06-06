package day08;

import java.util.Locale;

public class Day08StringManipulations01 {
    public static void main(String[] args) {
        //Note: in the methods that created by Java, first parameter is always inclusive, second and so on will be exclusive.
        //Count the alphabetical characters in a given String
        //Tom12 Hanks!... ==> 8

        //If your code is just for specific actions or data outputs then your code is called "Hard coding" and it`s not accepted. You should make it "Dynamic".
        //Dynamic code works with every data.

//        String s = "Tom12 Hanks!...";
//
//       int updatedSWithoutSymbols = s.replaceAll("[^A-Z,a-z]","").length();
//
//        System.out.println(updatedSWithoutSymbols);
//
//


        //Get the initials from full name. (Middle name is out of scope)
        //Tom Hanks ==> TH - tom hanks ==> TH

//        String name = " tOM hANKS ";
//
//        String initialOfFirstName = name.trim().toUpperCase().substring(0,1);
//
//       String initialOfLastName = name.trim().split(" ")[1].toUpperCase().substring(0,1);

        //Split() method separate String, it gets regex value and the index of the new separated string value in the [] brackets.
        // The character you used to split the String will not be visible after splitting.
        //trim() method removes all the spaces that is in the beginning of the String variable and the at the end.

        //The variables used inside the parenthesis are called "Parameters"
        //The values you used inside the method parenthesis are called "Arguments"

        //Substring(StartingIndex, EndingIndex)
        //StartingIndex is inclusive, EndingIndex is exclusive.


//        System.out.println(initialOfFirstName + initialOfLastName);


       //Fix the day names format like "Sunday".
        //If user gives you "sunday" ==> "Sunday" - "SUNDAY" ==> "Sunday" - "  sUNDAY   " ==> "Sunday"

//        String s = "   sunday   ";
//
//        String initial =  s.trim().substring(0,1).toUpperCase();
//
//       String initialOfOtherCharacters = s.trim().substring(1).toLowerCase();
//
//        System.out.println(initial + initialOfOtherCharacters);

// Make the all digits except from last 4 digits of a credit card invisible by using '*'
        //1234 1234 1234 1234 ==> **** **** **** 1234


//        String creditCardNum = "1234 1234 1234 1234";
//
//        String last4dDigitsOfTheCreditCardNum  = creditCardNum.substring(15);
//
//        String replaceWithTheSymbol = creditCardNum.substring(0,15).replaceAll("\\S","*"); // \\S means ==> ^Space   \\s means ==> space
//
//        System.out.println(replaceWithTheSymbol + last4dDigitsOfTheCreditCardNum);




        //Count how many characters different from space were used in a String
        //"Tom Hanks was born in 1975"   count all the characters except from the space
        //1.Way

        String s= "Tom Hanks was born in 1975!@#$#%#$^#^*$^&(^&))";

        int updatedS = s.replaceAll("\\s","").length();
        int numOfChars = s.replace(" ","").length();

        System.out.println(updatedS);
        System.out.println(numOfChars);

        //2. Way
        int numOfCharacters = s.replace(" ","").split("").length;
        System.out.println(numOfCharacters);








    }
}
