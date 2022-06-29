package practice_questions.week10;

public class Q05 {
    public static void main(String[] args) {
        /*
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16
     Hint:
     Character.isDigit()
     Integer.valueOf()
    */

        sumOfDigits("J4\\/4 1$ 34$¥");
    }

    public static void sumOfDigits(String s){

        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
              sum+= Integer.parseInt(""+s.charAt(i));
            }
        }
        System.out.println("Sum of digits "+ sum);
    }
}
