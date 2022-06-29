package day22;

public class Cat extends Mammal{
    @Override //Checks the overriding rules
    protected void eat() {
        System.out.println("Cats eat");
    }

    @Override
    protected Cat createAnimal() {
        return new Cat();
    }
}
