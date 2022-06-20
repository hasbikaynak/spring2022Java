package interview_questions;

public class InterviewQuestion10 {
    public static void main(String[] args) {
        //You need to write a simple Java program to check if a given String is palindrome or not. A Palindrome is a String which is equal to the reverse of itself,
        // e.g., "Bob" is a palindrome because of the reverse of "Bob" is also "Bob."  Though be prepared with both recursive and iterative solution of this problem.
        // The interviewer may ask you to solve without using any library method, e.g. indexOf() or subString() so be prepared for that.

        String s = "Kayaka";


        String newS = "";
        for (int i = s.length()-1; i > -1; i--) {
            newS += s.charAt(i);
        }
        System.out.println(newS);

        if (newS.equalsIgnoreCase(s)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }

    }
}
