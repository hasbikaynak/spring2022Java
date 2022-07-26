package interview_questions.Importante;

import java.util.*;
import java.util.stream.Collectors;

//Create a method to reverse given String
public class Iq01 {
    public static void main(String[] args) {
        System.out.println(getReverseGivenString("Hasbi"));
        System.out.println(getReverseGivenString1("Hasbi"));
        System.out.println(getReverseGivenString2("Hasbi"));
    }
    public static String getReverseGivenString(String word)
    {
        //For loop
        String container = "";
        for (int i = word.length()-1; i > -1 ; i--) {
            container+= word.charAt(i) + "";
        }
        return container;
    }

    public static String getReverseGivenString1(String word)
    {
        //String Builder
        StringBuilder stringBuilder = new StringBuilder(word);
        return stringBuilder.reverse().toString();
    }

    public static String getReverseGivenString2(String word)
    {
        //functional programming language
         String arr[] = word.split("");
        List<String> list = Arrays.stream(arr).collect(Collectors.toList());
        Collections.reverse(list);
        list.forEach(System.out::print);
         return "";
    }
}
