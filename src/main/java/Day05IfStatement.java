import java.util.Scanner;

public class Day05IfStatement {
    public static void main(String[] args) {
        /*
            If your score is less than 50 then you will fail
            if(Condition){
                <The code to be executed if the condition is true>
            }

            Note: We use "if statement" to decide which code will be executed under which condition


        Scanner scanner = new Scanner(System.in);
         System.out.println("Please enter your score");
         double score = scanner.nextDouble();

        if(score < 50.0)  {System.out.println("You failed");} else System.out.println("You passed");


        //Type code to check if the integer got from user is divided by 3 or not
        System.out.println("Please enter a integer value");
       int integerValue = scanner.nextInt();

        if (integerValue %3==0 ) {System.out.println("Dividable by 3");}else {System.out.println("Not dividable by 3");}


        //Type code to check if the first digit of a 3 digits integer is less than 5.
        //If it is less than 5 print 'perfect number' otherwise print 'good number'

        if (integerValue/100 < 5) {
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Good number");
        }
*/
        //Ask user to enter the initial of the day names then print the day names on the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the initial of a day name");

        String day = scanner.next().toUpperCase();

       returnTheDayName(day);
    }

    public static void returnTheDayName(String day)
    {

        if(day.equals("S")){
            System.out.println("Saturday and Sunday");
        }
        else if (day.equals("M")) {
            System.out.println("Monday");
        }
        else if (day.equals("T")) {
            System.out.println("Tuesday and Thursday");
        }
        else if (day.equals("W")) {
            System.out.println("Wednesday");
        }
        else if (day.equals("F")) {
            System.out.println("Friday");
        }
    }
}
