package day06;

public class Day06Ternary {
    public static void main(String[] args) {
        // Type code to check if a number is positive or not
        int x=12;

        String result = x>0 ? "Positive" : "Negative";
        System.out.println(result);

        //type code to check if an integer has 3 digits or not

        int y = 1000;
        int absY = Math.abs(y); // Absolute value

       String result1 = absY>99 && absY<1000?"It`s a 3 digit number":"It`s not a 3 digit number";
        System.out.println(result1);

        //Type code to check following conditions for state abbreviations in the USA.
        // 1) It should have 2 characters.
        // 2) It should have just upper cases.

        String abbreviation = "PL";

        boolean resultBoolean = abbreviation.length() == 2 && abbreviation.replaceAll("[A-Z]","").length() == 0;
        String result3 = resultBoolean ? "Valid abbreviation":"Invalid abbreviation";

        System.out.println(result3);

    }
}
