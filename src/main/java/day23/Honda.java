package day23;

/*
If you do not put "body" for a method it will be "abstract method"
To make a method abstract you have to use abstract keyword before the return type
abstract method cannot be put into a regular class, when you create an abstract method you have to make the class abstract.
to make a class abstract use abstract keyword before the class keyword.
the method without body is called abstract method
the method with body is called concrete method
concrete child classes must override(implement) abstract methods from all parents, otherwise Java gives CTE.
it is not mandatory for abstract child classes
if you want to make a functionality mandatory for all concrete child classes make the method abstract in parent class.
Final classes cannot have child classes, we create abstract classes to do sth mandatory for child classes. This is contradiction because of that Java does not allow to make an abstract
class final.
Abstract methods were created to override, if you make an abstract method private it can not be overridden, therefor Java does not allow to make an abstract method private.
We cannot crete objects from abstract classes because abstract classes have sth un-complete like abstract methods
Abstract classes are classes therefore they have constructors but the constructors cannot create objects.
If any abstract method was overridden by any concrete class (A) it is not mandatory to override the abstract method for the concrete child classes of the concrete class(A).
 */

public abstract class Honda {

    public abstract void engine();
    public void musicSystem(){
        System.out.println("The most updated music system. . .");
    }
}
