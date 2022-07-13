package practice_questions.week10;

import java.util.ArrayList;
import java.util.List;

public class Q06 {
    //Ask user to enter a string and encrypt it using Atbash

    public static void main(String[] args) {

//        String userInput = "babacan";
//
//        for (int i = 0; i < userInput.length(); i++) {
//            int index = 'z' - userInput.charAt(i);
//            System.out.print((char) ('a' + index));
//        }


        //Convert the given array into a complete sentence

//        char arr[] = {'h', 'e', 'l', 'l', 'o', 'j', 'a', 'v', 'a'};
//
//        String s = "";
//        for (char w:arr) {
//            s+=w;
//        }
//
//        String sFinal = s.replace("java","python");
//
//        System.out.println(sFinal);

        //Write a program that prints all the prime from 1 numbers till 100

//        List<Integer> primeNumbers = new ArrayList<>();
//        int num = 2;
//        int counter = 0;
//        while(num<100){
//            for (int i = 2; i <= num ; i++) {
//                if(num % i == 0){
//                    counter++;
//                }
//            }
//            if (counter == 1) {
//                primeNumbers.add(num);
//            }
//            num++;
//            counter=0;
//        }
//        System.out.println(primeNumbers);


        //There is a monkey on island.
        //he needs to eat 4 bananas every day
        //there are just 165 bananas available on island
        // write a program that tell how many days monkey will survive
        //if statements
        //loops
        // set the status of the MonkeyAlive to true or false according to the bananas.


        boolean isMonkeyAlive = true;
        int dayCounter = 0;
        int availableBananas = 165;
        int howMuchMonkeyAte = 0;

        while(isMonkeyAlive){
            howMuchMonkeyAte+=4;
            if (availableBananas < howMuchMonkeyAte) {
                isMonkeyAlive = false;
            }
            dayCounter++;
        }
        System.out.println(dayCounter);











    }
}
