package interview_questions;

public class InterviewQuestion04 {
    public static void main(String[] args) {
        //*************************** eBay interview question *******************************
        // Type code to print unique characters in a String
        // Alabama ==> Albm

        String s = "Alabama";


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.print(c);
            }

        }
    }
}
