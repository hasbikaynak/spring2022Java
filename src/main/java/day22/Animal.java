package day22;

public class Animal {
    protected void eat(){
        System.out.println("Animals eat");
    }
    protected Animal createAnimal(){ //A Class can be
//                                     1)Class
//                                     2)Data Type for a variable
//                                     3)Return Type in a method
        return new Animal();
    }
}
