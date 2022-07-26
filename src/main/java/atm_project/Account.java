package atm_project;

import java.text.DecimalFormat;
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

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    //interact with the user to withdraw money from checking account
    public void getCheckingWithdraw(){
        System.out.println("Your checking balance:\t"+moneyFormat.format(checkingBalance));
        System.out.println("Enter the amount you would like to withdraw: ");
        double withdrawAmount = input.nextDouble();
        if (withdrawAmount <= 0) {
            System.out.println("Negative or Zero amount is not acceptable");
            getCheckingWithdraw();
        } else if (withdrawAmount > checkingBalance) {
            System.out.println("You do not have enough money to get done this transaction");
        }
        else {
            calculateCheckingBalanceAfterWithdraw(withdrawAmount);
            System.out.println("Your checking balance:\t" + moneyFormat.format(checkingBalance));
        }
    }

    //interact with the user to deposit money to their checking account
    public void getCheckingDeposit(){
        System.out.println("Your checking balance:\t"+moneyFormat.format(checkingBalance));
        System.out.println("Enter the amount you would like to deposit: ");
        double depositAmount = input.nextDouble();
        if (depositAmount <= 0) {
            System.out.println("Negative or Zero amount is not acceptable");
            getCheckingDeposit();
        }else {
            calculateCheckingBalanceAfterDeposit(depositAmount);
            System.out.println("Your checking balance:\t" + moneyFormat.format(checkingBalance));
        }
    }

    //interact with the user to withdraw money from saving account
    public void getSavingWithdraw(){
        System.out.println("Your saving balance:\t"+moneyFormat.format(savingBalance));
        System.out.println("Enter the amount you would like to withdraw: ");
        double withdrawAmount = input.nextDouble();
        if (withdrawAmount <= 0) {
            System.out.println("Negative or Zero amount is not acceptable");
            getSavingWithdraw();
        } else if (withdrawAmount > savingBalance) {
            System.out.println("You do not have enough money to get done this transaction");
        }
        else {
            calculateSavingBalanceAfterWithdraw(withdrawAmount);
            System.out.println("Your saving balance:\t" + moneyFormat.format(savingBalance));
        }
    }

    //interact with the user to deposit money to their saving account
    public void getSavingDeposit(){
        System.out.println("Your checking saving:\t"+moneyFormat.format(savingBalance));
        System.out.println("Enter the amount you would like to deposit: ");
        double depositAmount = input.nextDouble();
        if (depositAmount <= 0) {
            System.out.println("Negative or Zero amount is not acceptable");
            getSavingDeposit();
        }else {
            calculateSavingBalanceAfterDeposit(depositAmount);
            System.out.println("Your saving balance:\t" + moneyFormat.format(savingBalance));
        }
    }

    //calculate checking balance after withdraw
    private double calculateCheckingBalanceAfterWithdraw(double amount){
        checkingBalance = checkingBalance - amount;
        return checkingBalance;
    }

    //calculate checking balance after deposit
    private double calculateCheckingBalanceAfterDeposit(double amount){
        checkingBalance = checkingBalance + amount;
        return checkingBalance;
    }

    //calculate saving balance after withdraw
    private double calculateSavingBalanceAfterWithdraw(double amount){
        savingBalance = savingBalance - amount;
        return savingBalance;
    }

    //calculate saving balance after deposit
    private double calculateSavingBalanceAfterDeposit(double amount){
        savingBalance = savingBalance + amount;
        return savingBalance;
    }

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
