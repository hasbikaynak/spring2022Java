import java.util.Scanner;

public class Day04Scanner04 {
    public static void main(String[] args) {
        /*
        Get first name and last name from user then print them in upper cases on the console with a space between them

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your firstname");
        String firstname = scanner.nextLine();
        System.out.println("Please enter your lastname");
        String lastname = scanner.nextLine();

        System.out.println("Your name and lastname is : " + firstname.toUpperCase() + " " + lastname.toUpperCase());
*/

        System.out.println(calculateTheMathematicalAction());
        System.out.println(powerOf7RaisedTo5());
        System.out.println(sumOfFirstAndLastDigit());
    }

    public static int calculateTheMathematicalAction()
    {
        int number = 2345;
        int resultOfAddition = number + 8;
        int divideTheNewResult= resultOfAddition/3;
        int moduleOfTheNewResult= divideTheNewResult%5;
        int multiplyTheNewResult = moduleOfTheNewResult*5;

        return multiplyTheNewResult;
    }

    public static double powerOf7RaisedTo5()
    {
        double num1= 5;
        double num2= 7;

        double result = Math.pow(num1,num2);
        return result;
    }
    public static int sumOfFirstAndLastDigit()
    {
        int num = 12345;
        int lastDigit = num % 10;

        int totalDigits = (int) Math.log10(num);
        int firstDigit = (int) (num/ (int) Math.pow(10,totalDigits));

        return firstDigit + lastDigit;
    }
}
