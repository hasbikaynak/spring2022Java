package atm_project;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account {
    Scanner input = new Scanner(System.in);

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer,Integer> credential = new HashMap<>();

    boolean flag = true;

    int chooseAccountType;

    public void login(){
        System.out.println("Hi! Welcome to techproed ATM");
        do{
         credential.put(12345,1234);
         credential.put(23456,2345);
         credential.put(34567,3456);
         credential.put(45678,4567);

         try {
             System.out.println("Enter account number");
             setAccountNumber(input.nextInt());
             System.out.println("Enter pin");
             setPin(input.nextInt());
         }catch (InputMismatchException e){
             e.printStackTrace();
             System.err.println("You`ve entered an invalid character");
             System.err.println("Please enter an integer value to proceed or you can type in 'Q' to exit");
             input.nextLine();
             String exit = input.next().toLowerCase();
             if (exit.equals("q")){
                 flag = false;
             }
         }
         int count = 0;
            for (Map.Entry<Integer, Integer> w :credential.entrySet()) {
                if (w.getKey().equals(getAccountNumber()) && w.getValue().equals(getPin())) {
                    System.out.println("Welcome to your account!");
                    flag=false;
                }else {
                    count++;
                }
            }

            if (count == credential.size()) {
                System.err.println("Account number or pin number does not match our users");
                System.err.println("Invalid User");
                System.out.println("Press any integer to try again or press 'Q' to exit");
                String exit = input.next();
                if (exit.equalsIgnoreCase("q")) {
                    flag = false;
                }
            }

        }while (flag);

        selectAccount();


    }

    private void selectAccount(){
        do {
            try {
                System.out.println("Please choose account type");
                System.out.println("1-) Checking Account" +
                        "\n2) Saving Account" +
                        "\n3) Exit");
                chooseAccountType = input.nextInt();
            }catch (RuntimeException e) {
                e.printStackTrace();
                System.err.println("You`ve entered an invalid character");
                System.out.println("Please enter an integer value to proceed or you can type in 'Q' to exit");
                input.nextLine();
                String exit = input.next().toLowerCase();
                    if (exit.equals("q")) {
                        System.out.println("Bye Bye");
                        flag = false;
                    }
                }

        }while (flag);

        switch (chooseAccountType){
            case 1:
                optionsForCheckingAccount();
                break;
            case 2:
                //saving account actions
               optionsForSavingAccount();
                break;
            case 3:
                System.out.println("Bye Bye");
                break;
            default:
                System.err.println("Invalid input try again");
                selectAccount();
        }

    }

    private void optionsForCheckingAccount(){
        System.out.println("Enter which transaction you want to process with");
        System.out.println("1) Withdraw" +
                "\n2) Deposit" +
                "\n3) Exit");
        int option =  input.nextInt();
        switch (option){
            case 1:
                getCheckingWithdraw();
                break;
            case 2:
                getCheckingDeposit();
            case 3:
                break;
            default:
                System.err.println("Invalid input try again");
                optionsForCheckingAccount();
        }
        System.out.println("Would you like to do some other process?(y/n)");
            String otherProcessYesOrNo =  input.next();
            if (otherProcessYesOrNo.equalsIgnoreCase("y")) {
                optionsForCheckingAccount();
            }
            else if(otherProcessYesOrNo.equalsIgnoreCase("n")) {
                System.out.println("Bye Bye");
            }
            else {
                System.err.println("Unexpected behaviour!!!");
            }
    }

    private void optionsForSavingAccount(){
        System.out.println("Enter which transaction you want to process with");
        System.out.println("1) Withdraw" +
                "\n2) Deposit" +
                "\n3) Exit");
        int option =  input.nextInt();
        switch (option){
            case 1:
                getSavingWithdraw();
                break;
            case 2:
                getSavingDeposit();
            case 3:
                break;
            default:
                System.err.println("Invalid input try again");
                optionsForCheckingAccount();
        }
        System.out.println("Would you like to do some other process?(y/n)");
        String otherProcessYesOrNo =  input.next();
        if (otherProcessYesOrNo.equalsIgnoreCase("y")) {
            optionsForSavingAccount();
        }
        else if(otherProcessYesOrNo.equalsIgnoreCase("n")) {
            System.out.println("Bye Bye");
        }
        else {
            System.err.println("Unexpected behaviour!!!");
        }
    }





















}
