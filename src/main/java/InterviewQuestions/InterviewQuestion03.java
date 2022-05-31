package InterviewQuestions;

public class InterviewQuestion03 {
    public static void main(String[] args) {
        // *************************Good interview question********************************
        //Type code to find the sum of the digits of an integer
        //2543 ==> 14

        int container = 0;

        for (int i = 123456; i > 0; i/=10) {
            container = container + i%10;
        }

        System.out.println(container);
    }
}
