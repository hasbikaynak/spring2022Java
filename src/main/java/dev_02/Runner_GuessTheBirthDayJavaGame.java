package dev_02;
public class Runner_GuessTheBirthDayJavaGame {
    public static void main(String[] args) {
        int startNum = 1, lastNum = 6;
        System.out.println("Welcome to the birthday guessing game" +
                "\nYou`ll be shown to 5 numbers if your birthday is one of them you`ll say so, we`ll find it by the help of our set array");
            GuessTheBirthDayJavaGame.findUserBirthDay(startNum,lastNum);
    }
}
