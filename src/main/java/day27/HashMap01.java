package day27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap01 {
    public static void main(String[] args) {
        //Type code to find the number of occurrences of letters in a String
        //"toms are phantoms" ==> t=2 o=2 m=2 s=2 a=2 r=1
        //Array is faster than String for this kinda examples try to use array instead of String

        String s = "13, toms are phantomsaa.?";
        String sWithLetters = s.replaceAll("[^A-Za-z]","");
        String[] arr = sWithLetters.split("");



        Map<String,Integer> hashMap = new HashMap<>();



        for (String w:arr) {

            if (hashMap.containsKey(w)) {
                hashMap.put(w,hashMap.get(w)+1);
            }
            else{
                hashMap.put(w,1);
            }
        }

        System.out.println(hashMap);
    }
}
