public class Day09StringManipulations04 {
    public static void main(String[] args) {
        //Type a code to find the number of punctuation marks used in a String.

//        String s = "Wow!... Ali is 13 years old, and he is a university student)(";
//
//       int totalNumOfChars = s.length();
//
//        int strWithoutPunctuationMarks = s.replaceAll("\\p{Punct}","").length(); // \\p{Punct} is represents all punctuation marks.
//
//        int totalNumOfCharsWithoutPunctuation = totalNumOfChars - strWithoutPunctuationMarks ;
//        System.out.println(totalNumOfCharsWithoutPunctuation);

        //Create a method prints greetings by using the given name
        //Ali ==> Hi Ali      Tom ==> Hi, Tom

        System.out.println(greeting("Hasbi"));
        System.out.println(limitDecimalPart(12.12123123f));

        //create a method makes the decimal part has 5 digits.

    }

    public static String greeting(String name){  //%s ==> referencing // to use %s we have to use it in a String.format() method
        return  String.format("Hi %s " , name);
    }

    public static String limitDecimalPart(float num){
        return String.format("The price is %.5f", num); // %.5d means decimal part will be 5 digits.
    }


}
