package atm_project;

public class SavingAccount extends Account{

    //view saving balance
    private double viewSavingBalance(){
        return getSavingBalance();
    }

    //Calculate saving balance after withdraw
    private double calculateSavingBalanceAfterWithdraw(double balance){
        double newBalance = balance - getSavingBalance();
        return newBalance;
    }


    //Calculate saving balance after deposit
    private double calculateSavingBalanceAfterDeposit(double balance){
        double newBalance = balance + getSavingBalance();
        return newBalance;
    }
}
