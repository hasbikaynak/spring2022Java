package dev_02;

public class BankInternal {
    private String accountNumber;

    private double initialBalance;

    public BankInternal(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.initialBalance = initialBalance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    @Override
    public String toString() {
        return "\nBankInternal  {" +
                " Account Number = '" + accountNumber + '\'' +
                ", Initial Balance = " + initialBalance +
                " }";
    }


    public void depositMoney(double amount){
        System.out.println(toString());
        this.initialBalance += amount;
        System.out.println("New initial balance after the transaction "+ getInitialBalance()+"\n");
    }

    public void withdrawMoney(double amount){
        System.out.println(toString());
        if (amount <= initialBalance) {
            this.initialBalance -= amount;
            System.out.println("New initial balance after the transaction "+ getInitialBalance()+"\n");
        }
        System.out.println("The amount that you want to withdraw is not sufficient!!!");
    }
}
