package day20;

/*
        Polymorphism = Overloading + Overriding

        1)We need methods with same name and different parameters to make our code more readable.
        This is method overloading.

        2)How can you make the parameters different?
           i) By changing the number of parameters.
           ii) By changing the data types of the parameters.
           iii) By changing the order if the daya types are different.

         3) Can you overload "private" method.
         Method overloading is done in a single class.private access modifier creates issue if you are outside the class. Therefore, doing method overloading will not be a problem for the private methods.

         4)Can you overload "static" methods.
         Static methods can be overloaded.

         5) Method overloading is a part of the polymorphism because
 */

public class Overloading01 {
    public static void main(String[] args) {


        System.out.println(add(3,4));
        System.out.println(add(3,"Java"));


    }




    public static int add(int a, int b){
        return a+b;
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static String add(String a, String b){
        return a+b;
    }

    public static String add(String a, int b){
        return a+b;
    }

    public static String add(int a, String b){
        return a+b;
    }
}
