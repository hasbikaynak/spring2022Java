import java.util.Scanner;

public class Day06NestedIfStatement {
    public static void main(String[] args) {
        /*
        If the gender is "Male" and the age is less than 13 print "Boy", otherwise print "Man"
        If the gender is "Female" and the age is less than 13 print "Girl", otherwise print "Woman"
        If the gender is different from "Male" and "Female" print "No information" on the console
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your gender...");
        String gender = input.next().toLowerCase();

        System.out.println("Please enter your age...");
        int age = input.nextInt();

        if (gender.equals("male")) {

            if (age<13) {
                System.out.println("Boy");
            }
            else{
                System.out.println("Man");
            }
        }
        else if (gender.equals("female")) {
            if (age<13) {
                System.out.println("Girl");
            }
            else{
                System.out.println("Woman");
            }
        }
        else {
            System.out.println("No information");
        }
    }
}
