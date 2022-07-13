package day28;

public class E03 {
    public static void main(String[] args) {
        String s = "Java is easy";
        getNumOfCharsInString(s);

        String str = null;
        getNumOfCharsInString(str); // NullPointerException ==> runtime exception

    }
    public static void getNumOfCharsInString(String s){
        try {
            System.out.println(s.length());
        }catch (NullPointerException e){
            System.err.println(e.getMessage()+ "length() method was used with null String"); // this non-technical message is called log.
            //type code and put a log
            //log4J ==> log.info("something goes here");
        }
    }
}
