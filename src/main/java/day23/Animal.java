package day23;

public class Animal {

    public Animal() {
        System.out.println("Animal constructor has been worked. . .");
    }
    public Animal(String msg){
        this();
        System.out.println("Animal constructor with " + msg +" has been worked. . .");
    }

}
