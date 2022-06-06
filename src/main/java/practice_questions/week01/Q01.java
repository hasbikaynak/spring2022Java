package practice_questions.week01;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*
	 Ask user to enter his/her first name, last name, age, height and weight then print them on console in this way:
	 		First Name: ...
	 		Last Name : ...
	 		Age: ...
	 		Height: ...
	 		Weight: ...
	 Note: Use only one "System.out.println();"

	 */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName= input.next();
        System.out.println("Please enter your last name");
        String lastName = input.next();
        System.out.println("Please enter your age");
        int age = input.nextInt();
        System.out.println("Please enter your height");
        double height =  input.nextDouble();
        System.out.println("Please enter your weight");
        double weight = input.nextDouble();

        System.out.print("First Name:"+" "+ firstName+ "\nLast Name:"+" "+ lastName +"\nAge:" +" "+ age + "\nHeight:"+" "+height + "\nWeight:"+" "+weight);
    }
}
