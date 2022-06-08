package practice_questions.week04;

public class Q02 {
    public static void main(String[] args) {
        // Print just last two elements (Use 'continue')
        int arr[] = { 9, 4, 23, 12,24,12,10};

//        for (int i = 0; i < arr.length; i++) {
//            if (arr.length-2 > i) {
//                continue;
//            }
//            System.out.print(arr[i] + " ");
//        }

        //Print the elements from index 2 to index 4(Use 'continue' and 'break')

        for (int i = 0; i < arr.length; i++) {
            if (i < 2 ) {
                continue;
            }
            if (i > 4) {
                break;
            } System.out.print(arr[i] + " ");
        }





    }
}
