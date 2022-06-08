package practice_questions.week04;

public class Q01 {
    public static void main(String[] args) {
        //Print your name without using any letter your name contains.
//        char c1 = 'B'-1;
//        char c2 = 'm'-1;
//        char c3 = 'j'-1;
        //Ali

        /* Write a Java program to take the last three characters
    from a given string and add these three characters
    at both the front and back of the string.
    */
        String s = "Mark";

        String last3chars = s.substring(s.length()-3); // ark

        System.out.println(last3chars+ s + last3chars); //arkMarkark


    }
}
