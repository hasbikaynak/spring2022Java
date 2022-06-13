package week05;

public class Budget {
    //Type code to calculate house budget and house members' own budgets.

    static int houseBudget = 10000;
    int ownBudget = 2000;

    public static void houseBudget(int outcome){

        houseBudget-=outcome;

    }

    public void ownBudget(int outcome){
        ownBudget-=outcome;

    }

    public static void getSalary(int salary){

        houseBudget+=salary;


    }

}
