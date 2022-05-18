public class Day02MethodCreation {
    public static void main(String[] args) {
        System.out.println(addIntegers(1,2));
        System.out.println(multiplyIntegers(2,3));
        System.out.println(subtractIntegers(5,1));
        System.out.println(divedIntegers(4.3,2));
    }
    public static int addIntegers(int num1, int num2){
        return num1 + num2;
    }
    public static int multiplyIntegers(int num1,int num2)
    {
        return num1 * num2;
    }
    public static int subtractIntegers(int num1,int num2){
        return num1-num2;
    }
    //Create a dynamic division method
    public static double divedIntegers(double num1,double num2)
    {
        return num1/num2;
    }
}
