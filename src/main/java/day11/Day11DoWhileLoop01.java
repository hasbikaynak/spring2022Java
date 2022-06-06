package day11;

import java.util.Scanner;

public class Day11DoWhileLoop01 {
    public static void main(String[] args) {
        //Compare the given loops

//        int i= 1;
//
//        while (i < 1){
//            System.out.println("While");
//            i++;
//        }
//
//
//        int k =1;
//
//        do{
//            System.out.println("Do-while");
//            k++;
//        }while(k<1);

        /*
        Ask user to enter an integer.
		  If the integer is less than 100, tell user "Won!"
		  Otherwise, tell user "Lost!"
        * */
//        Scanner input = new Scanner(System.in);
//
//
//        int score;
//        do {
//
//            System.out.println("Enter a score");
//            score = input.nextInt();
//            if (score < 100) {
//
//                System.out.println("Won");
//            }
//        } while (score < 100);
//
//        System.out.println("Lost");



        /*
        Username is "admin", Password is "pwd123"
	 	Ask user to enter username and password
	 	User should see "Enter your username and password" message
	 	If he enters correct credentials he should get "You are in your account!" message
	 	Otherwise, he should see "Enter your username and password" message 3 times
	 	After 3 times he should get "Your account is blocked" message
         */

        Scanner input = new Scanner(System.in);

        String username = "admin";
        String password = "pwd123";

        int counter=0;

        do {

            if (counter == 3) {
                System.out.println("Your account is blocked");
                break;
            }


            System.out.println("Enter your username");
            String userNameByUser = input.next();
            System.out.println("Enter your password");
            String passwordByUser = input.next();

            counter++;

            if (userNameByUser.equals(username) && passwordByUser.equals(password)) {

                System.out.println("You are in your account");
                System.out.println("Attend of trying is: " + counter);
                break;
            }

        }while(true);




















    }
}
