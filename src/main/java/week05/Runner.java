package week05;

public class Runner {

    public static void main(String[] args) {

        Budget.houseBudget(2000);

        Budget son=new Budget();
        son.ownBudget(150);

        Budget daughter=new Budget();
        daughter.ownBudget(400);

        Budget.houseBudget(4000);

        son.houseBudget(2000);

        Budget.getSalary(20000);
        Budget.getSalary(10000);
        daughter.getSalary(5000);
        son.getSalary(1000);


        System.out.println("House Budget: "+Budget.houseBudget);
        System.out.println("Son ownBudget: "+son.ownBudget);//1850
        System.out.println("Daughter ownBudget: "+daughter.ownBudget);


    }
}
