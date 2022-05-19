public class Day05ConcatenationIf {
    public static void main(String[] args) {
    /*
        Concatenation: Joining Strings with each other or with other data types
                       To do concatenation we have 2 options;
                       1)Use '+' sign ==> Can be used with all data types
                       2)Use 'concat()' method ==> Inside the concat() method parenthesis you can put just String not the other
     */

        String s = "Tom";
        String t = "Hanks";
        int i = 12;
        int k = 5;
        char c ='A';

        System.out.println(s + " " + t);
        System.out.println(s.concat(" ").concat(t));
    }
}
