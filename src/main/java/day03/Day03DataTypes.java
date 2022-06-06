package day03;

public class Day03DataTypes {
    public static void main(String[] args) {
        //Type casting
//Auto widening
        byte age = 12;
        int myAge= age;
//Explicit Narrowing
        double x = 23.45;
        long y = (long)x;

        String name = "Mark Twain";

        System.out.println(name.length());

        //Wrapper class

        System.out.println(Float.MIN_VALUE);

        //Autoboxing
        int a =12;
        Integer b=a;

        //Unboxing
        Integer c = 12; //This is primitive data type,so it uses more data in the memory.
        int d = c;

        //Stack Memory: Small Memory, Primitive data is stored in the stack memory, Java puts the addresses(references) of non-primitive data into the stack memory.
        //Heap Memory:
    }

}
