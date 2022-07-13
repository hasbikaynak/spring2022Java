package dev_02;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class GuessTheBirthDayJavaGame {
    /*
        Guess the birthday Java game

    There is a really fun game：

    Ask your friend 5 number questions  to find out which day of month is his/her birthday. Each question asks whether his birthday is one of the five numbers.

    The 5 sets are:

    Set1：1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31
    Set2：2 3 6 7 10 11 14 15 18 19 22 23 26 27 30 31
    Set3 ：4 5 6 7 12 13 14 15 20 21 22 23 28 29 30 31
    Set4 ：8 9 10 11 12 13 14 15 24 25 26 27 28 29 30 31
    Set5：16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31

    Birthday is the sum of the first number of each set that appears on this day. For example, birthday is 19th, then it will appear in sets 1, 2 and 5.
     The first numbers of the three sets are 1, 2 and 16 respectively. Their sum is 19.the
     */
    static GuessTheBirthDayJavaGame gameSets = new GuessTheBirthDayJavaGame();
    static Scanner input = new Scanner(System.in);
    static int[] userBirthDayInclude = new int[5];
    static int counter = 0;
    static int userBirthDay;
    static int firstValue = 0;
  private final int[] set1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31};
  private final int[] set2 = {2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31};
  private final int[] set3 = {4,5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29 ,30 ,31};
  private final int[] set4 = {8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31};
  private final int[] set5 = {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

    public int[] getSet1() {
        return set1;
    }

    public int[] getSet2() {
        return set2;
    }

    public int[] getSet3() {
        return set3;
    }

    public int[] getSet4() {
        return set4;
    }

    public int[] getSet5() {
        return set5;
    }

    /*
   showFiveNumbers() ==> shows user, range between those numbers.
    */
    public static void showFiveNumbers(int startNum, int lastNum){
        for (int i = startNum; i < lastNum; i++) {
            System.out.println(i);
        }
    }

    /*
    findUserBirthDay() ==> waits answer from the user (y/n). If user says "n", iterates through itself until user gives an "y" as answer.
    if it lasts at 31, automatically gives user 31 as answer.
     */
    public static void findUserBirthDay(int startNum, int lastNum){
        showFiveNumbers(startNum, lastNum);
        System.out.println("Do you see your birthday on the console?(y/n)");
        String userAnswer = input.next();
        if(userAnswer.equalsIgnoreCase("n")) {
            counter++;
            startNum = lastNum;
            lastNum += 5;
            if (counter == 6) {
                System.out.println(31);
                userBirthDay = 31;
                findUserBirthDayWithHelpOfSetArrays(gameSets.getSet1());
                findUserBirthDayWithHelpOfSetArrays(gameSets.getSet2());
                findUserBirthDayWithHelpOfSetArrays(gameSets.getSet3());
                findUserBirthDayWithHelpOfSetArrays(gameSets.getSet4());
                findUserBirthDayWithHelpOfSetArrays(gameSets.getSet5());
                System.out.println("Your birthday is " + firstValue);
            }else{
                findUserBirthDay(startNum, lastNum);
            }
        }else if(userAnswer.equalsIgnoreCase("y")){
            for (int j = 0; j < userBirthDayInclude.length; j++) {
                userBirthDayInclude[j] = startNum;
                startNum++;
            }
            lastFiveNumbersIncludeUserBirthDay(0);
        }
        else {
            System.out.println("Enter 'y' or 'n'!!!");
        }
    }
    /*
    lastFiveNumbersIncludeUserBirthDay() ==> gets last 5 number which used in findUserBirthDay(). Expects (y/n) from user. Shows user these 5 numbers one by one.
    If user gives "y", shows user`s birthday.
     */
    public static void lastFiveNumbersIncludeUserBirthDay(int index){
       try {
           System.out.println("Is this your birthday " + userBirthDayInclude[index] + "?");
           String userBirthDayString = input.next();
           if (userBirthDayString.equalsIgnoreCase("y")) {
               userBirthDay = userBirthDayInclude[index];
               findUserBirthDayWithHelpOfSetArrays(gameSets.getSet1());
               findUserBirthDayWithHelpOfSetArrays(gameSets.getSet2());
               findUserBirthDayWithHelpOfSetArrays(gameSets.getSet3());
               findUserBirthDayWithHelpOfSetArrays(gameSets.getSet4());
               findUserBirthDayWithHelpOfSetArrays(gameSets.getSet5());
               System.out.println("Your birthday is " + firstValue);
           } else if(userBirthDayString.equalsIgnoreCase("n")){
               lastFiveNumbersIncludeUserBirthDay(index + 1);
           }
           else {
               System.out.println("Enter 'y' or 'n'!!!");
           }
       }catch (IndexOutOfBoundsException e){
        throw new IndexOutOfBoundsException("Enter 'y' or 'n'!!!");
       }
    }

    /*
    findUserBirthDayWithHelpOfSetArrays() ==> loops through the sets and find the user birthday by the help of sum of the set`s 1. elements
     */
    public static void findUserBirthDayWithHelpOfSetArrays(int[] getSet) {
        for (int w : getSet) {
            if (w == userBirthDay) {
                firstValue += getSet[0];
            }
        }
    }

}
