package PracticeQuestions;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        /*
        * Type code to do bank transactions below at an ATM:
	 Process 1: Balance inquiry
	 Process 2: Money withdrawal
	 Process 3: Deposit money
	 Process 4: End the process
	 * */

        Scanner input = new Scanner(System.in);
        System.out.println("Please select your transaction that you want to make: \n" +
                "\t Process 1: Balance inquiry\n" +
                "\t Process 2: Money withdrawal\n" +
                "\t Process 3: Deposit money\n" +
                "\t Process 4: End the process");
        int operation = input.nextInt();

        double balance = 100;

        switch (operation){
            case 1:
                System.out.println(String.format("Balance inquiry %s$",balance));
                break;
            case 2:
                System.out.println("How much money do you want to withdraw");
                double withdraw = input.nextDouble();
                if (withdraw <= balance) {
                    balance = balance-withdraw;
                    System.out.println(String.format("After transaction your balance is %s$",balance));
                }else {
                    System.out.println("You do not have enough money to make this transaction");
                }
                break;
            case 3:
                System.out.println("How much money do you want to deposit");
                double deposit = input.nextDouble();
                if (deposit <= Integer.MAX_VALUE) {
                    balance = balance+deposit;
                    System.out.println(String.format("After transaction your balance is %s$",balance));
                }else {
                    System.out.println("You exceeded to limit of amount of deposit");
                }
                    break;
            case 4:
                System.out.println("End process");
                break;
            default:
                System.out.println("Enter a valid number");

        }
    }
}
