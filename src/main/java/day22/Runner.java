package day22;
/*
    1) Method overriding means updating method body to make the implementation specific for the Child Class.
    2) Inheritance is prerequisite for Method Overriding. If there is no parent-child relationship, there will be no Method Overriding.
    3)The method in child class is called Overriding Method.
    4) Access modifier of overriding method can not be narrower than the access modifier of overridden method.
    5) Return type can not be narrower than the data returned.
 */
public class Runner {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();

        Dog d = new Dog();
        d.eat();


    }
}
