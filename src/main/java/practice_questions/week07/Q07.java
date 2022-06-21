package practice_questions.week07;

public class Q07 {
    public static void main(String[] args) {
        /*
        Create a method that adds given integers except the first one and multiplies the sum by the first integer.
         */
        multiplyAndAdd(2,5,6);
        multiplyAndAdd(1,5,6);
    }
    public static void multiplyAndAdd(int first, int... numbers){
        int sum=0;
        for (int w: numbers) {
            sum+=w;
        }
        sum*=first;
        System.out.println(sum);
    }
}
