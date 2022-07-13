package dev_02;

import java.util.Scanner;

public class Bank {

   static int userAnswer;
    static bankInternal myObj = new bankInternal(900.5);
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        bringMenu();
    }

    private static void bringMenu() {
        System.out.println("Welcome to the MoneyInTheBank");
        do {

            System.out.println("\nMenu: "+
                    "\nType 1 to deposit money"+
                    "\nType 2 to withdraw money"+
                    "\nType 3 to check balance"+
                    "\ntype 4 to exit");
            userAnswer = input.nextInt();
            bringSwitch();
        }while (userAnswer != 4);
    }

    private static void bringSwitch() {
        switch (userAnswer){
            case 1:
                depositAmount();
                break;
            case 2:
                withdrawAmount();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                greetingsUser();
                break;
            default:
                System.out.println("Invalid input!!!");
        }
    }

    private static void withdrawAmount() {
        System.out.println("Enter the amount that you want to withdraw?");
        double withdrawAmount = input.nextDouble();
        myObj.withdrawMoney(withdrawAmount);
    }

    private static void depositAmount() {
        System.out.println("Enter the amount that you want to deposit?");
        double depositAmount = input.nextDouble();
        myObj.depositMoney(depositAmount);
    }

    public static void checkBalance(){
        System.out.println(myObj.toString());
    }
    public static void greetingsUser(){
        System.out.println("Thanks for choosing us." +
                " You are in a good hands ;)");
    }
}
