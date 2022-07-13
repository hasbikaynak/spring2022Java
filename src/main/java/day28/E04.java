package day28;

public class E04 {
    public static void main(String[] args) {
        String s = "123";
        convertStringToIntegerThenDivideByGivenNumber(s,2);

        convertStringToIntegerThenDivideByGivenNumber("1a",3); //NumberFormatException ==> runtime
        convertStringToIntegerThenDivideByGivenNumber("1234",0); //ArithmeticException ==> runtime
    }
    public static void convertStringToIntegerThenDivideByGivenNumber(String s, int num){
        try {
            System.out.println(Integer.parseInt(s) / num);
        }
        catch (NumberFormatException e){
            System.err.println(e.getMessage() + " Issue occurred in conversion");
        }catch (ArithmeticException e){
            System.err.println(e.getMessage() + " Issue occurred in division");
        }
    }
}
