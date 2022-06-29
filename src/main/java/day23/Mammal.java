package day23;

public class Mammal extends Animal{
    public Mammal() {

        System.out.println("Mammal constructor has been worked. . .");
    }
    public Mammal(int num) {
        super("Testing");
        System.out.println("Mammal constructor has been worked with "+ num +" . . .");
    }

    public Mammal(String s) {
        this(); // calls a constructor Mammal()
        System.out.println("Mammal constructor has been worked with "+ s +" . . .");
    }
}
