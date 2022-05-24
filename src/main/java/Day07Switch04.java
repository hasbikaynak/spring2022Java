import java.util.Scanner;

public class Day07Switch04 {
    public static void main(String[] args) {
        //Ask user to enter one of the +, -, *, /, % operations.
        //Ask user to enter 2 double values then return the result of the operation
//NOTE: boolean, double, long, float can not be used in switch brackets.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first value");
        double num1 =  input.nextDouble();

        System.out.println("Please enter second value");
        double num2 =  input.nextDouble();

        System.out.println("Enter the operation sign that you want to calculate");
        char operation = input.next().charAt(0);

        switch (operation){
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2)); // this is the way using for dynamic result
                break;
              case '-':
                  System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
              case '*':
                  System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                break;
              case '/':
                  System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                break;
              case '%':
                  System.out.println(num1 + " % " + num2 + " = " + (num1*num2/100));
                break;
            default:
                System.out.println("That operation is not defined");
        }
    }
}
