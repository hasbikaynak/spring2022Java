package practice_questions.week02;

public class Q04 {
    public static void main(String[] args) {
        //Print the characters of all numbers between 0-255

        for (int i = 0; i < 256; i++) {
            char c = (char)i;
            System.out.print(c);
        }
    }
}
