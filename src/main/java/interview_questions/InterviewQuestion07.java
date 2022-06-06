package interview_questions;

import java.util.Arrays;
import java.util.Comparator;

public class InterviewQuestion07 {
    public static void main(String[] args) {
        //Sort the array elements in descending order according to their lengths.
        //If some elements are in the same length put them in alphabetical order
        //"Michael", "Ali","Maria","Veli" ==> "Ali" - "Veli" - "Maria" - "Michael"

        String arr[] = {"Jack", "Mark","Adam" , "Jackson" ,"Marry","Junior Thomson"};

        Arrays.sort(arr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder())); // [Junior Thomson, Jackson, Marry, Jack, Mark, Adam]
                                                                                                                       //[Junior Thomson, Jackson, Marry, Adam, Jack, Mark]

        System.out.println(Arrays.toString(arr));
    }
}
