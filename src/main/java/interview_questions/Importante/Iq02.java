package interview_questions.Importante;
// swap 2 integers
public class Iq02 {
    public static void main(String[] args) {
swapIntegers(23,98);
swapIntegers1(23,98);
    }
    public static void swapIntegers(int num1, int num2){
        System.out.println("Before swapping " + num1 + " " + num2);
        int container = 0;
        container = num1;// container = 10
        num1 = num2; // num1 = 20
        num2 = container;// num2 == 10

        System.out.println("After swapping "+ num1 + " " + num2 );
    }

    public static void swapIntegers1(int num1, int num2){
        System.out.println("Before swapping " + num1 + " " + num2);

        int lastDigit = num1 % 10; // 3
        int firstDigit = num1 / 10; //2

        System.out.println("num2" + " = "+ firstDigit + ""  + lastDigit);

        int lastDigitNum2 = num2 % 10; //8
        int firstDigitNum2 = num2 / 10; //9

        System.out.println("num1" + " = "+ firstDigitNum2 + ""  + lastDigitNum2);


    }
}
