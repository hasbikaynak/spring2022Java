package interview_questions;

import java.util.ArrayList;

public class InterviewQuestion08 {
    public static void main(String[] args) {
        //Create an Integer List which has repeated elements then remove the duplicate elements.
        //[2,3,2,2,3,5] ==> [2,3,5]
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(2);
        originalList.add(3);
        originalList.add(2);
        originalList.add(2);
        originalList.add(3);
        originalList.add(5);
        System.out.println(originalList);
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (Integer w:originalList
             ) {
            if (!uniqueList.contains(w)) {
                uniqueList.add(w);
            }
        }
        System.out.println(uniqueList);
    }
}
