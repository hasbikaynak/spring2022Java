package interview_questions.Importante;

public class Iq05 {
    /*
    From a given array find all pairs whose sum is a given number
    {4,6,5,-10,8,5,20} ==> 10
    for example: 4+6=10, 5+5=10, -10+20= 10
     */
    public static void main(String[] args) {
        findTheGivenNumberFromAnArray(new int[]{4,6,5,-10,8,5,20}, 100);
    }
    public static void findTheGivenNumberFromAnArray(int[] arr, int number)
    {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == number) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + (arr[i]+arr[j]));
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("No pair appeared");
        }
    }
}
