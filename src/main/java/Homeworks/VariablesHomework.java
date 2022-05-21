package Homeworks;

import java.util.Scanner;

public class VariablesHomework {
    /*

    1) Create double variables for the prices of any 3 items. Print the sum of the prices on the console with a label.

    2) Create a float variable, a long variable, and an integer variable for any 3 items.
       Print the multiplication of the values on the console with a label.

    3) Type a code to find simple interest.

    4) Create a String and two Long variables. Print the sum and the multiplication of the long variables with the String on the console.

    5) Create two boolean variables whose values are different and print their values in the same line with a space between two consecutive values.

    6) Create 3 float variables for the price of a book, notebook, and laptop. Print the total price of 2 books, 4 notebooks and 3 laptops on the console.

    7) Type a code to swap two integers.
      a) Use 3rd variable

      b) Do not use 3rd variable

     */

    public static void main(String[] args) {

        /*
        // 1)
        double item1 = 19.99;
        double item2 = 29.99;
        double item3 = 39.99;

        System.out.println("The sum of your purchase is: " + (item1 + item2 + item3));

        // 2)
        float item4 = 30.99f;
        long item5 = 40;
        int item6 = 50;

        System.out.println("Multiplication of your items: " + item4*item5*item6);

        // 3)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the Principal amount");
        double principal = scanner.nextDouble();

        System.out.println("Please enter the Rate of interest");
        int rate = scanner.nextInt();

        System.out.println("Please enter the Time");
        int time = scanner.nextInt();

        var simpleInterest = (principal*rate*time)/100;

        System.out.println(simpleInterest);

        //4)
        String myString = "Testing";
        Long myLong = 123123l;
        Long myLong2 = 1231232312l;

        System.out.println(myString +" "+ (myLong + myLong2));
        System.out.println(myString +" "+ myLong * myLong2);

        //5)
        boolean myBooleanTrue = true;
        boolean myBooleanFalse = false;

        System.out.println(myBooleanTrue + " " + myBooleanFalse);

        //6)

        float book = 19.99f, notebook = 18.99f, laptop = 15.99f;
        float totalPrice = (2*book) + (4*notebook) + (3*laptop);

        System.out.println("Total price is" + " " + totalPrice);


         */
        //7)
        int int1 = 14;
        int int2 = 12;
        int swap = int1;

        int1 = int2;
        int2 = swap;

        System.out.println(int1 + " " + int2);


        int1 = int1 + int2; // 26
        int2 = int1 - int2; // 14
        int1 = int1 - int2; // 12

        System.out.println(int1 + " " + int2);
    }
}
