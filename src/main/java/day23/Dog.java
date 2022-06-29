package day23;

public class Dog extends Mammal{

    public Dog() {
        super(44);
        System.out.println("Dog constructor has been worked. . .");
    }
    public Dog(int x) {
        this();
        System.out.println("Dog constructor has been worked with "+ x +" . . .");
    }

}
