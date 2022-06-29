package practice_questions.week10;

import java.util.ArrayList;
import java.util.List;

public class Q01 {
    public static void main(String[] args) {
        /*
		A list has elements “M”, “K” and “P”
		Ask user to enter a letter
		If the letter exists in list convert it to "Got it"
		otherwise add it to the list.
		*/
        List<String> list = new ArrayList<>();
        list.add("M");
        list.add("K");
        list.add("P");

        String letter = "P";

            if (list.contains(letter)) {
                list.set(list.indexOf(letter),"Got it");
            }
            else {
                list.add(letter);
            }

        System.out.println(list);
    }
}
