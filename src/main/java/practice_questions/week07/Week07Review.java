package practice_questions.week07;

public class Week07Review {
    //Check if a String is palindrome or not.
    public static void main(String[] args) {
//        String s = "kayak";
//        String string = new StringBuilder(s).reverse().toString(); // kayaka
//        System.out.println("Is Palindrome? "+ string.equals(s));


        //Write a Java method to find the smallest number among three numbers given by user.

//        int num1 = 4;
//        int num2 = 3;
//        int num3 = 2;
//
//        System.out.println("Min value is: "+getMinValue(num1,num2,num3));

        // Convert the "Congratulations" word to "sn**t*l*t*rgn*C" by using Array methods.

//        String s = "Congratulations";
//        String[] sArr = s.split("");
//
//        String container = "";
//
//        for (int i = sArr.length-1; i > -1 ; i--) {
//            if (sArr[i].equals("a") || sArr[i].equals("i") || sArr[i].equals("o") || sArr[i].equals("u")) {
//                container += "*";
//            }
//            else {
//                container+= sArr[i];
//            }
//        }
//        System.out.println(container);


















    }
    public static int getMinValue(int num1, int num2, int num3){
        return Math.min(num1,Math.min(num2,num3));
    }
}
