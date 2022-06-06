package day06;

import java.util.Scanner;

public class Day06IfElseStatement02 {
    public static void main(String[] args) {
        /*
        1) At least 8 characters
        2) Contains at least 1 uppercase
        3) Contains at least 1 lowercase
        4) Contains at least 1 symbol(different from letters and digits)
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = scanner.next();

        if (password.length() < 8) {
            System.out.println("Your password must be at least 8 characters long");
        }

        //Regex: stands for regular expressions. They are used to define a group of data.

        else if (password.replaceAll("[^A-Z]","").length() == 0) {  // ^ ==> means different from
            System.out.println("Password is invalid because it does not contain any uppercase character");
        }

        else if (password.replaceAll("[^a-z]","").length()==0) {
            System.out.println("Password is invalid because it does not contain any lowercase character");
        }

        else if (password.replaceAll("[A-Za-z\\d]","").length() ==0) {  // \\d stands for the range of 0-9
            System.out.println("Password is invalid because it does not contain any symbol");
        }

        else{
            System.out.println("Password has been accepted. Welcome to your Account");
        }


        System.out.println("=====================================================");

        if (password.length() < 8) {
            System.out.println("Your password must be at least 8 characters long");
        }

        //Regex: stands for regular expressions. They are used to define a group of data.

         if (password.replaceAll("[^A-Z]","").length() == 0) {  // ^ ==> means different from
            System.out.println("Password is invalid because it does not contain any uppercase character");
        }

         if (password.replaceAll("[^a-z]","").length()==0) {
            System.out.println("Password is invalid because it does not contain any lowercase character");
        }

         if (password.replaceAll("[A-Za-z\\d]","").length() ==0) {  // \\d stands for the range of 0-9
            System.out.println("Password is invalid because it does not contain any symbol");
        }
    }
}
