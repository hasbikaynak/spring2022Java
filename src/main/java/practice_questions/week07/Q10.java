package practice_questions.week07;
public class Q10 {
    public static void main(String[] args) {
        //Create a method that joins the given Strings
        //input => "Please", "join", "the", "given", "words"
        //output => "Please join the given words"

        System.out.println(joinStrings("Please","join","the","given","words"));
    }
    public static String joinStrings(String... word)
    {
        String container ="";
        for (String w:word) {
            container+= w+" ";
        }
        return container;
    }
}
