package practice_questions.week07;

public class Q01 {
    public static void main(String[] args) {
        //Check if a String is palindrome or not.
        String s = "kayak";

       //I. WAY
        String reversedS =  new StringBuilder(s).reverse().toString();

        System.out.println("Is String palindrome? " + s.equals(reversedS));


        //II. WAY
//        String container = "";
//        for (int i = s.length()-1; i > -1 ; i--) {
//            container+= s.charAt(i);
//        }
//        System.out.println(container);
//
//        if (container.equalsIgnoreCase(s)) {
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not palindrome");
//        }
    }
}
