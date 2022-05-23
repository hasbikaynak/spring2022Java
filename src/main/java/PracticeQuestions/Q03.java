package PracticeQuestions;

public class Q03 {
    public static void main(String[] args) {
        // Write a Java program to break an integer into a sequence of individual digits.
        // Hint: use / and %
        // x: input: 12345
        //    output: 1
        //            2
        //            3
        //            4
        //            5

        int x = 12345;
        //First way
//        int lastDigit = x%10;
//
//        x= x/10;
//        int beforeLastDigit = x%10;
//
//        x=x/10;
//        int thirdDigit = x%10;
//
//        x=x/10;
//        int secondDigit = x%10;
//
//        x=x/10;
//        int firstDigit = x;

        //Second way

        int ones = x%10;
        int tens = (x/10)%10;
        int hundreds = (x/100)%10;
        int thousands = (x/1000)%10;
        int tenThousands = x/10000;

        //System.out.println("\n"+firstDigit+"\n"+secondDigit+"\n"+thirdDigit+"\n"+beforeLastDigit+"\n"+lastDigit);
        System.out.println("\n"+tenThousands+"\n"+thousands+"\n"+hundreds+"\n"+tens+"\n"+ones);



    }
}
