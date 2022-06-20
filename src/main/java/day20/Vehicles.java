package day20;
/*
   1) Constructors are used to create an object from a class.
   if there is no constructor, it`s impossible to create an object from a class.

   2) Java knows classes are for object creations, because of that Java puts constructor in every class.
   Constructor coming from Java will be invisible, it is called "default constructor".
   default constructors ==> public Vehicle(){} syntax of default constructors.
   method               ==> public int add(){}

   3) Java is jealous, when you create your own constructor Java deletes the default one.

   Interview question
   4)What are the differences between constructors and methods.
      i) constructors for object creations but methods are for some actions.
      ii) constructors do not have return type but methods must have return type.
      iii) name of constructors must match with the name of the Class, but methods can use any name.
   */
public class Vehicles {


    String make;
    String model;
    int year;
    double price;

    public Vehicles(){

    }
    public Vehicles(String make, String model,int year,double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Vehicles(String make, String model, double price){
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public Vehicles(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

}
