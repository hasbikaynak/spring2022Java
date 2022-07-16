package day31;

public class Utils {

    public static void putSpacesBetweenElements(Object object){
        System.out.print(object + " ");
    }
    public static boolean isEvenNumbers(Integer integer){
        return integer %2 == 0;
    }
    public static boolean isOddNumbers(Integer integer){
        return integer %2 != 0;
    }
    public static int getSquareOfNumbers(Integer integer){
        return integer*integer;
    }
    public static int getCubeOfNumbers(Integer integer){
        return integer*integer*integer;
    }
    public static double findHalfOfNum(Integer integer){
        return integer/2.0;
    }
    public static char getLastChar(String str){
        return str.charAt(str.length()-1);
    }
    public static int sumOfNumbersBetweenTwoIntegers(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x = x / 10;
       }
        return sum;
    }
}
