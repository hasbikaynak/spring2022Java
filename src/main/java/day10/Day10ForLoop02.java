package day10;

public class Day10ForLoop02 {
    public static void main(String[] args) {
        //********************************** very common interview question for loop
        //Type code to reverse a string
        // Tom Hanks ==> sknaH moT

//        String s ="Tom Hanks";
//        String reversed = "";
//
//        for (int i = s.length()-1; i>=0; i--) {
//            reversed = reversed + s.charAt(i);
//        }
//        System.out.println(reversed);



        // *************************Good interview question********************************
        //Type code to find the sum of the digits of an integer
        //2543 ==> 14

        int sumOfDigits = 0;     //first do %10 and get the last digit , then /10 removes last digit, then %10 get last digit again , /10 remove last digit and %10 get last digit.


//        int absI = Math.abs(i);

        for ( int i = 237; i > 0 ; i/=10) {

           sumOfDigits = sumOfDigits + i%10;
        }

        System.out.println(sumOfDigits);
    }
}
