package interview_questions;

public class InterviewQuestion02 {
    public static void main(String[] args) {
        //********************************** very common interview question for loop
        //Type code to reverse a string

        String s = "Tom Hanks";
        String container = "";

        for (int i = s.length()-1; i >= 0 ; i--) {
            container = container + s.charAt(i);
        }
        System.out.print(container);
    }
}
