package day18;

public class VarArgs01 {
    public static void main(String[] args) {
        /*
        * 1) Varargs are used to handle multiple parameters in a single method
        * 2) Any parameter cannot be used after varargs
        * 3) Before the varargs you can use parameters
        * 4) In a method, we can use just a single varargs, and it must be the last parameter */
        System.out.println(add());
        System.out.println(add(5));
        System.out.println(add(5,10));
        System.out.println(add(5,10,15));
    }
    public static int add(int... a){//... means user can enter whatever value, there is no restriction on the length.
        int sum = 0;
        for (int w:a) {
            sum+=w;
        }
        return sum;
    }
}
