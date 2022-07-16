package atm_project;

import java.util.Scanner;

public class Account {
    /*
    Greetings
    Options:
    1)Checking account ==> 1)View Balance  2)Withdraw 3)Deposit 4)Exit
    2)Saving account ==> 1)View Balance  2)Withdraw 3)Deposit 4)Exit
    3)Quit
     */

   private int accountNumber;
   private int pin;
   private double checkingBalance;
   private double savingBalance;

   private static double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        Account.balance = balance;
    }

    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }
}
