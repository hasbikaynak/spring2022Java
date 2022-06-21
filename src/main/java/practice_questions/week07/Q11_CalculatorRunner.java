package practice_questions.week07;

public class Q11_CalculatorRunner {
    public static void main(String[] args) {
        /*
    Create a basic calculator, create add, subtract, multiply, divide methods.
     */
        Q11_Calculator calculator = new Q11_Calculator();
        System.out.println(calculator.add(1,2,3,4,5,6,7,8,9));
        System.out.println(calculator.subtract(1,2));
        System.out.println(calculator.multiply(1,2,3,4,5,6,7,8,9));
        System.out.println(calculator.divide(0,6));
    }
}
