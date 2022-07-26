package interview_questions.Importante;

public class Iq03 {
    //Ask user to print number of the fibonacci numbers then print numbers on the console
    // 7 --> 1 1 2 3 5 8 13
    public static void main(String[] args) {
        getFibonacciSeries(7);
    }
    public static void getFibonacciSeries(int limit)
    {
        int firstFiboNum = 1;
        int secondFiboNum = 1;
        int nextFiboNum = firstFiboNum + secondFiboNum;
        System.out.print(firstFiboNum + " " + secondFiboNum + " " + nextFiboNum + " ");
        for (int i = 3; i < limit; i++) {
            firstFiboNum = secondFiboNum;
            secondFiboNum = nextFiboNum;
            nextFiboNum = firstFiboNum + secondFiboNum;
            System.out.print(nextFiboNum+ " ");
        }
    }
}
