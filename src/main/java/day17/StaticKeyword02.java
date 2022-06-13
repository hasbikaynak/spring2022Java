package day17;

public class StaticKeyword02 {
    public static void main(String[] args) {

        //Just class name is enough to access static things.
        System.out.println(StaticKeyword01.sCounter);

        //To access non-static things you have to create object
        StaticKeyword01 obj = new StaticKeyword01();
        System.out.println(obj.counter);

        //To access static things using objects is allowed
        //but not recommended
        System.out.println(obj.sCounter);
    }
}
