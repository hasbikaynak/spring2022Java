package day10;

import java.util.Scanner;

public class Day10ForLoop03 {
    public static void main(String[] args) {

        //*************************** eBay interview question *******************************
        // Type code to print unique characters in a String
        // Alabama ==> Albm

        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a String to see unique characters");
//        String uniques =  input.nextLine();
//        for (int i = 0; i < uniques.length(); i++) {
//            char c = uniques.charAt(i);
//            if (uniques.indexOf(c) == uniques.lastIndexOf(c)) {
//                System.out.print(c);
//            }
//        }


        //Type code to print the following image on the console
        //          X X X X X
        //          X X X X X
        //          X X X X X

        System.out.println("Enter the number of columns and rows");
        int col = input.nextInt();
        int row = input.nextInt();

        // 1 row 3 columns

        //nested loop  ==> use loop inside the loop

        for (int i = 1; i <= row ; i++) {

            String s = "";

            for (int j = 0; j < col; j++) {
                s=s+"X ";
            }
            System.out.println(s);
        }























    }
}
