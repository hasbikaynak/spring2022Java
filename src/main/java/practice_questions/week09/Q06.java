package practice_questions.week09;

import java.util.ArrayList;
import java.util.List;

public class Q06 {
    /*
    Create a method to add 10 random integers from 0 to 20 into a List. Convert even numbers to 111.
    If there is no even number print on console "There is no even number".
    */
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        addIntegers(integerList);
    }


    public static void addIntegers(List<Integer> integerList){
          int counter = 0;
        while(true) {
            counter++;
            for (int i = 0; i < 10; i++) {
                integerList.add((int) (Math.random() * 20));
            }

            int flag = 0;
            for (int i = 0; i < integerList.size(); i++) {
                if (integerList.get(i) % 2 == 0) {
                    integerList.set(i, 111);
                    flag++;
                }
            }
            System.out.println(integerList);
            if (flag == 0) {
                System.out.println("There is no even number");
                System.out.println("Attempts: "+ counter);
                break;
            }
        }
    }
}
