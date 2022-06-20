package day20;

/*
   1-) Object-Oriented Programming Language(OOP) has 4 main principals.
        i) Encapsulation     ii) Polymorphism    iii) Inheritance    iv) Abstraction

        2)Encapsulation: Data hiding
           i) Some data needs to be hidden like, SSN, password, username...
           ii) By hiding some data we make our codes more readable
           iii) Encapsulation gives us flexibility.
        3) How to hide data?
           By using "private" access modifier, We can hide the data
        4) After hiding data how can you read it?
           By the help of the getters we can access to the encapsulated data and read it.
        5) After hiding the data how can you update it?
           By the help of the setters we can access to the encapsulated data and update it.
        6) Creating getters and setters called "Java Beans"
 */


public class Student {
   // 1)Create private variables
    private String name = "Tom Hanks";
    private int age = 25;
    private boolean successful = true;

    public Student() {
    }

    // 2) Create constructors you need
    public Student(String name, int age, boolean successful) {
        this.name = name;
        this.age = age;
        this.successful = successful;
    }


    // Create getters and create setters and toString()


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isSuccessful() {
        return successful;
    }




    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }



    @Override //If you want to see object details on the console, create toString method.
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", successful=" + successful +
                '}';
    }
}
