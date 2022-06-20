package question_bank2;

public class Q08 {
    public static void main(String[] args) {
        //Write a program to get the last index of a String within a String.
        // a b c d e f g h i j
        // ======================
        // 36 10 7 40 33 16 42 32 6 20
        // The quick brown fox jumps over the lazy dog

        String s = "The quick brown fox jumps over the lazy dog";
        String targetValue = "The".toLowerCase();

        int targetValueLastIndex = s.lastIndexOf(targetValue);



        System.out.println(targetValueLastIndex);

    }
}
