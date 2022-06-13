package day17;

public class StaticKeyword01 {
           /**Question 1: How do you use non-static things inside the main method?
           * There are 2 ways;
           * i)make it static
           * ii)Create an object then by the help of the object use it in main method

           * Question 2: How do you access to static and non-static things from outside the clas?
           * If it`s static just class name is enough to access it.
            * To access non-static things you have to create object
             */
    public static int sCounter = 0;
    public int counter = 0;

    public StaticKeyword01(){
    sCounter++;
    counter++;
    }


    public static void main(String[] args) {
        /*The things like Moon in Java is called "static"
        * 1)Static things are common for all objects
        * 2)Any update on "static" things will effect all objects and will be visible by all objects.
        * */

        StaticKeyword01 obj = new StaticKeyword01();
        StaticKeyword01 obj1 = new StaticKeyword01();
        StaticKeyword01 obj2 = new StaticKeyword01();

        System.out.println(sCounter);
        System.out.println(obj.counter);
        System.out.println(obj1.counter);
        System.out.println(obj2.counter);
    }
}
