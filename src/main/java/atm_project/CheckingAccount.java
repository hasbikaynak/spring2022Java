package atm_project;

public class CheckingAccount extends Account{

    //view checking balance
    private double viewCheckingBalance(){
        return getCheckingBalance();
    }

    //Calculate checking balance after withdraw
    private double calculateCheckingBalanceAfterWithdraw(double balance){
        double newBalance =  balance - getCheckingBalance();
        return newBalance;
    }

    //Calculate checking balance after deposit
    private double calculateCheckingBalanceAfterDeposit(double balance){
        double newBalance = balance + getCheckingBalance();
        return newBalance;
    }

}
