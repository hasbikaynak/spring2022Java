package PracticeQuestions;

public class Q07 {
    public static void main(String[] args) {
        //Ask user to enter first name, middle name and last name as one single String, then print the first character of middle name and last name.
        //e.g. Mark Hansel Twain==> HT

        String s = "Mark Hansel Twain".trim();

        //1. Way
//        String middleName = s.split(" ")[1]; // Hansel
//        String firstInitialOfMiddleName = middleName.substring(0,1); //H
//
//        String lastName = s.split(" ")[2]; // Twain
//        String firstInitialOfLastName = lastName.substring(0,1); // T
//
//        System.out.println(firstInitialOfMiddleName + firstInitialOfLastName);



        //2. Way
         char middleName = s.charAt(s.indexOf(" ")+1); //H
         char lastName = s.charAt(s.lastIndexOf(" ")+1); //T
        System.out.println(middleName + "" + lastName);
    }
}
