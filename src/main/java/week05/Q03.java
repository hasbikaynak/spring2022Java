package week05;

import java.util.Arrays;
import java.util.Scanner;

public class Q03 {
    /*
      Create  a method to ask user to enter two strings and check them if they are "Anagram" or not.


       ===Interview Question===
      * Anagram is to create a new word from other word's characters.
      * Write java code to check if two words are anagram or not
      * isAnagram("listen", "Silent") ==> anagram
      * Dormitory = Dirty room
      * School master = The classroom
      * Conversation = Voices rant on
      * Listen = Silent
      * Astronomer = Moon starer
      */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first String");
        String first=input.nextLine();
        System.out.println("Enter second String");
        String second=input.nextLine();

        anagram(first, second);
    }


    public static void anagram(String str1, String str2){
        String[] sArr=str1.toLowerCase().replace(" ","").split("");
        String[] sBrr=str2.toLowerCase().replace(" ","").split("");

        Arrays.sort(sArr);
        Arrays.sort(sBrr);

        if(Arrays.equals(sArr, sBrr)){
            System.out.println("Anagram");

        }else{
            System.out.println("NOT Anagram");
        }

    }
}

