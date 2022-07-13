package dev_02;

public class bankInternal {
    private final String accountNumber;
    private int counter = 1;

    private double initialBalance;

    public bankInternal(double initialBalance) {
        this.accountNumber = getAccountNumber();
        this.initialBalance = initialBalance;
    }


    public String getAccountNumber() {
        String generateAccountNumber = String.valueOf(Math.random()) + counter++;
        generateAccountNumber = generateAccountNumber.substring(2,9);
        return generateAccountNumber;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    @Override
    public String toString() {
        return "\nBankInternal  {" +
                " Account Number = '" + accountNumber + '\'' +
                ", Initial Balance = " + initialBalance +
                " }";
    }

    public void depositMoney(double amount){
        System.out.println(this);
        this.initialBalance += amount;
        System.out.println("New initial balance after the transaction "+ getInitialBalance()+"\n");
    }

    public void withdrawMoney(double amount){
        System.out.println(this);
        if (amount <= initialBalance) {
            this.initialBalance -= amount;
            System.out.println("New initial balance after the transaction "+ getInitialBalance()+"\n");
        }
        else {
            System.out.println("The amount that you want to withdraw is not sufficient!!!");
        }
    }
}
