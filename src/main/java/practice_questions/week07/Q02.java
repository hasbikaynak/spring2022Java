package practice_questions.week07;

public class Q02 {
    public static void main(String[] args) {
        //Write a Java method to find the smallest number among three numbers given by user.
        int num1 = 1;
        int num2 = 2;
        int num3 = -8;
        System.out.println("Min value is: " + getMinValue(num1,num2,num3));
    }
    public static int getMinValue(int num1, int num2, int num3){
        int startPoint = Math.min(num1,num2);
        int  minValue = Math.min(startPoint,num3);
        return minValue;
    }
}
