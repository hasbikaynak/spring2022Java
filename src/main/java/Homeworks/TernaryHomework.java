package Homeworks;

public class TernaryHomework {
    public static void main(String[] args) {
        /*
        * Use ternary to print
a) "Round up by last digit" and print the rounded value if the last digit of an integer is greater than or equal to 5
b) "Round down by last digit" and print the rounded value if the last digit of an integer is less
than 5
 For example; 127 will be rounded up and the value will be 130
 125 will be rounded up and the value will be 130
 123 will be rounded down and the value will be 120 */

//        int a = 123;
//       String result = a %10 >= 5 ? "Round up by the last digit"+" "+ (a/10+1)*10 : "Round down by the last digit"+" "+ (a/10)*10;
//
//        System.out.println(result);

        /*
        * Type code to check the password
 If it has more than 8 characters, initial should be 'i'
 If it does not have more than 8 characters initial should be 'K'
 Solve the task by using nested-ternary*/

//        String password = "iasdasdasdads";
//
//       String result= password.length() > 8 ? (password.startsWith("i") ? "Valid": "Invalid" ): password.startsWith("K") ? "Valid" : "Invalid";
//        System.out.println(result);


        /*
        * Type code to calculate the absolute value of a number
 For positive numbers and zero absolute value is the same with the number
 For negative numbers to find absolute value multiply the number by -1
 * */

//       int a = -80;
//
//      int result = a >= 0 ? a : -a;
//        System.out.println(result);




        /*
        * If the number has 3 digits, the output will be “This number has 3 digits.” Otherwise, the
output will be “This number has no 3 digits.”*/

//        int a = -213;
//        int absA = Math.abs(a);
//
//       String result = absA>99 && absA<1000 ? "Has 3 digits" : "Does not have 3 digits";
//
//        System.out.println(result);


        /*
        * Print 'Even' for even integers, print ‘Odd’ for odd integers by using ternary
        * */

        int a =13;

       String result = a%2==0 ? "Even" : "Odd";
        System.out.println(result);






















    }
}
