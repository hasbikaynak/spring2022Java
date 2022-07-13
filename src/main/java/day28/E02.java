package day28;

import java.util.Arrays;

public class E02 {
    public static void main(String[] args) {
        String[] arr = {"A","C","B"};
        getElementFromArray(arr,3); //ArrayIndexOutOfBoundsException ==> Runtime exception

        System.out.println("testing");
    }
    public static void getElementFromArray(String[] arr, int idx){
       try {
           System.out.println(arr[idx]);
       }catch (ArrayIndexOutOfBoundsException e){
           System.err.println(e.getMessage() + " Non existing index was used");
       }
    }
}
