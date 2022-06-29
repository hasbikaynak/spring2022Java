package dev_02;

public class Bank {
    public static void main(String[] args) {
        BankInternal myObj = new BankInternal("11604166",900.5);

        myObj.depositMoney(500);

        myObj.withdrawMoney(100000);
    }
}
