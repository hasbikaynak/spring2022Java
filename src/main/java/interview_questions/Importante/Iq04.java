package interview_questions.Importante;

public class Iq04 {
    // Prime number = can be divided by 1 and itself
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(2));
    }
    public static boolean isPrimeNumber(int number) {
        int counter = 0;
        if (number > 0){
            if (number == 1) {
                return true;
            }
            else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        counter++;
                    }
                }
                if (counter == 0) {
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        else {
            return false;
        }
    }
}
