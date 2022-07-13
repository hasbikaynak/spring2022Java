package day28;

public class E01 {
    /*
    Exception is un-expected issue
    There are 2 ways to work with exceptions
        i)Throw exception ==> Ask help
        ii) Handle Exception ==> Do it by yourself without asking help
    Mainly there are 2 types of exceptions
        i)Runtime exception ==> You will see them at runtime
        ii)Compile time exception ==> You will see them while you type your code
     */
    public static void main(String[] args) {
        divide(12,3); 
        divide(0,3);

        divide(12,0);//ArithmeticException
        //if you use ,if statement in order to handle an exception, it`s bad practice, and you need to write all the scenarios
    }
    public static void divide(int a, int b){
        try {
            System.out.println(a / b);
        }catch (ArithmeticException e) {
            System.err.println(e.getMessage()); // ==> / by zero
            //This is "log"ing.
            e.printStackTrace(); // This is the exact same message with the runtime exception we get.
        }
    }
}
