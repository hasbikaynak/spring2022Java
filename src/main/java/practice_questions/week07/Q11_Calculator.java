package practice_questions.week07;

public class Q11_Calculator {

    public double add(double...numbers){
        int sum = 0;
        for (double w:numbers) {
            sum+=w;
        }
        return sum;
    }
    public double subtract(double num1, double num2){
        return num1-num2;
    }
    public double multiply(double...numbers){
        int sum = 1;
        for (double w:numbers) {
            sum*=w;
        }
        return sum;
    }
    public double divide(double num1, double num2){
        if (num1 == 0 || num2 == 0) {
            System.out.println("Do not use 0!!!");
        }
            return num1/num2;
    }
}
