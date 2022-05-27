package Homeworks;

public class StringManipulationsHomework {
    public static void main(String[] args) {
        /*Create a String variable for city names which have just a single word.
Print the city name with the initial is in uppercase and all the other characters
are in lower cases on the console.
Example: mIAMI should be printed as Miami
 miami should be printed as Miami
 MIAMI should be printed as Miami
 mIaMi should be printed as Miami etc
 */

//        String city = "MIAMI";
//
//       String updatedCityName = city.trim().toLowerCase();
//
//       updatedCityName = updatedCityName.substring(0,1).toUpperCase() + updatedCityName.substring(1);
//
//        System.out.println(updatedCityName);


        /*
        Create 3 String variables for people's names. Print the sum of the number of characters in
all the 3 names except space characters.
Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.
        * */

//        String name1 = "Ali Can";
//        String name2 = "Merve Star";
//        String name3 = "Mark Tom";
//
//        String updatedName1 = name1.replaceAll("\\s","");
//        String updatedName2 = name2.replaceAll("\\s","");
//        String updatedName3 = name3.replaceAll("\\s","");
//
//
//        int name1Length = updatedName1.length();
//        int name2Length = updatedName2.length();
//        int name3Length = updatedName3.length();
//
//        System.out.println(name1Length + name2Length + name3Length);


/*Create a String variable, print the total number of alphabetical and numeric characters in
the String on the console.
Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console.
* */



//        String s = "Miami 33018!!!";
//
//        int numOfAlpAndNumericChars = s.replaceAll("[^A-Z,a-z,0-9]","").length();
//
//        System.out.println(numOfAlpAndNumericChars);

/*
Create a String variable, print the number of non-digit characters in the String on the
console.
Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console
* */

//        String s = "2a3B4?-!5";
//
//        int numOfNonDigitChars = s.replaceAll("[0-9]","").length();
//
//        System.out.println(numOfNonDigitChars);


        /*
        * Create a String variable and print just the last non-space character on the console for any
String.
Example: For ‘Ali Can’ you should print n
 For ‘Miami ’ you should print i etc.*/

//          String s = "Miami ";
//
//          int indexOfLastDigitWithoutSpace = s.trim().length();
//          String lastNonSpaceChar = s.substring(indexOfLastDigitWithoutSpace-1, indexOfLastDigitWithoutSpace+1);
//
//          System.out.println(lastNonSpaceChar);


        /*Create a String variable and find the sum of the ASCII values of the first and the last
characters of the String.
        * */

//        String s = "Miami";
//
//        int indexOfLastChar = s.length()-1;
//
//        int asciiOfFirst = s.charAt(0);
//
//        int asciiOfLast = s.charAt(indexOfLastChar);
//
//        System.out.println(asciiOfFirst + asciiOfLast);


        /*Create a String variable and print all characters except the first character on the console.
 Example:If the String is ‘Java’ you should print ‘ava’ on the console.*/

//String s =" Java";
//
//String restOfDigits = s.trim().substring(1);
//
//        System.out.println(restOfDigits);


/*
* Create a String variable and print all characters except the last character on the console in
uppercases.
Example:If the String is ‘Java’ you should print ‘JAV’ on the console.*/


//String s = " Java ";
//
//int indexOfLastDigit = s.trim().length()-1;
//
//String restOfDigits = s.trim().substring(0,indexOfLastDigit).toUpperCase();
//
//        System.out.println(restOfDigits);

        /*Create a String variable and print all characters except the first character and the last
character on the console in uppercases.
Example:If the String is ‘Java’ you should print ‘AV’ on the console.
        * */

//String s = "Java";
//
//int indexOfLastDigit = s.length()-1;
//
//      String sWithoutFirstAndLastDigit  = s.trim().substring(1,indexOfLastDigit).toUpperCase();
//
//        System.out.println(sWithoutFirstAndLastDigit);


        /*
        * Type code to check if a String has just a single space character any position in the middle
Example: For ‘Ali Can’ your code should print false on the console
 For ‘ Ali Can ’ your code should print false on the console
 For ‘ Ali Can ’ your code should print false on the console
 For ‘Ali Can’ your code should print true on the console*/

//        String s ="Tom Hanks";
//
//        String sTrimmed = s.trim();
//        String allExceptSpace = sTrimmed.replaceAll("\\s","");
//
//        boolean isThereSingleSpaceInTheMiddle = sTrimmed.length() - allExceptSpace.length()==1;
//        System.out.println(isThereSingleSpaceInTheMiddle);



        /*
        * Type code to check if a String does not have any space character at the beginning and at
the end?
Example: For ‘ Ali ’ your code should print false on the console
 For ‘Ali’ your code should print true on the console
 * */

//        String s = "Ali";
//
//        String sTrimmed = s.trim();
//
//         boolean isThereAnySpaceAtLastOrInTheBeginning = s.equals(sTrimmed);
//
//        System.out.println(isThereAnySpaceAtLastOrInTheBeginning);

/*
Type code to check if a String has an uppercase initial and dot at the end.
Example: For ‘Ali’ your code should print false on the console
 For ‘ali.’ your code should print false on the console
 For ‘ Ali. ’ your code should print false on the console
 For ‘Ali.’ your code should print true on the console
 For ‘ALI.’ your code should print true on the console
* */

//        String s = "Tom Hanks.";
//        char firstChar = s.trim().charAt(0);
//        char lastChar = s.charAt(s.length() - 1);
//
//        boolean isTheFirstCharUpper =firstChar >='A'&& firstChar<='Z';
//        boolean isTheLastCharDot = lastChar == '.';
//
//        boolean isFirstUpperLastDot = isTheFirstCharUpper && isTheLastCharDot;
//
//        System.out.println(isFirstUpperLastDot);


        /*Type code to check if a password is valid or not for the following conditions;
Password must have at least 8 characters different from space character
Password must have at least 1 symbol
Example: For ‘A2b!’ your code should print false on the console
 For ‘A2b3cdef’ your code should print false on the console
 For ‘!1a23b4’ your code should print false on the console
 For ‘!1a23b4?es’ your code should print true on the console
 For ‘! a b 3 k’ your code should print false on the console
        * */



//        String s = "ASDasdasdads!";
//         boolean isDifferentFromSpaceAnd8long =  !s.contains(" ") && s.length() >= 8;
//
//         boolean isHaveAtLeast1Symbol = s.replaceAll("[^\\p{Punct}]","").length() >= 1;
//
//         boolean isDifferentFromSpaceAnd8longAndIsHaveAtLeast1Symbol = isDifferentFromSpaceAnd8long && isHaveAtLeast1Symbol;
//
//
//        System.out.println(isDifferentFromSpaceAnd8longAndIsHaveAtLeast1Symbol);













    }
}
