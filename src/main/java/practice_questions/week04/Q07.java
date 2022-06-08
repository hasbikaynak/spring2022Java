package practice_questions.week04;

public class Q07 {
    public static void main(String[] args) {
        /*
        Write code to find the sum of the dollars and sum of the euros in the given string
         */
        String s = "$1 $12 €34 €56 $45 €78";

       String arr[] = s.split(" ");

       int dollars=0;
       int euros=0;
        for (String w:arr
             ) {
            if (w.contains("$")) {
                dollars += Integer.valueOf(w.replace("$", ""));
            }
            else {
                euros+= Integer.valueOf(w.replace("€", ""));
            }
        }
        System.out.println("Sum of the dollars: " + dollars + " , sum of the euros: " + euros);
    }
}
