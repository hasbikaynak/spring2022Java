package practice_questions.week05;

public class Q02 {
    //Create a method to print "Mark" on console by picking the characters from the "alphabet string".
// String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        public static void main(String[] args) {

            System.out.println(nameIt("M","A","R","K"));

        }
        public static String nameIt(String str1, String str2, String str3, String str4){
            Q02 obj = new Q02();
            String alph = obj.alphabet;

            char ch1 = alph.charAt(alph.indexOf(str1));

            char ch2 = alph.toLowerCase().charAt(alph.indexOf(str2));

            char ch3 = alph.toLowerCase().charAt(alph.indexOf(str3));

            char ch4 = alph.toLowerCase().charAt(alph.indexOf(str4));

            return "" + ch1 + ch2 + ch3 + ch4 + " Twain";

    }
}
