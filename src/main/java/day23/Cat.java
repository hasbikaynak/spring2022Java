package day23;

public class Cat extends Mammal{
    public Cat() {
       // super(12); // Super() must be in the first line.
        // In a constructor body you can do just a single constructor call, multiple calls are not allowed.
        System.out.println("Cat constructor has been worked. . .");

    }
    public Cat(boolean b) {
       // super(); //typing super is optional.If you type it`s more readable but developers don`t use it.
        System.out.println("Cat constructor has been worked with "+ b +" . . .");
    }
}
