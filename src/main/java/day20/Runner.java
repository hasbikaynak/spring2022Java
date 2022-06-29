package day20;

import day21.Cat;
import day21.Dog;

public class Runner {
    /*
    1)Private class members CANNOT be inherited by Child Classes from Parent Class. Impossible to inherited.
    2)Public class members can be inherited by Child Classes from Parent Class. Always can be inherited.
    3)Protected class members can be inherited by Child Classes from Parent Class. Always can be inherited.
    4)Default class members CANNOT be inherited by Child Classes from Other packages. if you are in the same package it can be inherited.

    When you call a variable in parent-child relationship look at the data type of the object
    When you call a method in parent-child relationship look at the constructor of the object
    There is IS-A relationship from child class to parent class.
    There is HAS-A relationship from parent class to child class.
    If there is no parent child relationship, you can not have is-a or has-a relationship.

    */
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.drink();
        cat1.eat();
        cat1.meow();
        cat1.weight();


        Dog dog1 = new Dog();
        dog1.bark();
        dog1.drink();
        dog1.eat();
    }
}
