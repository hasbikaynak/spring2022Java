package day22;

public class Dog extends Mammal{
    @Override
    protected void eat() {
        super.eat();
        System.out.println("Dogs are animals so they eat as well");
    }
}
