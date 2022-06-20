package day19;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*String class is immutable but, sometimes we need mutable Strings because of that
        * java created StringBuilder and StringBuffer classes*/

        String s = "Java";
        // Java creates a reference point in the stack memory and then creates a
        //String container and put the "Java" in it
        String s1 = "Java";
        // but whenever we created the same String value in the another String
        //Java will go to the String pool and check if container has the same value, if so will create
        // reference point in the stack memory and will take the "Java".
        s="Apex";
        //If we update the "Java" to the "Apex". s1 will be also "Apex".
        //When we work with the Strings, most of the time we use "=" sign. It checks if the value has matches.
        //But "==" checks value and the address. Checking address is Java`s task, not ours.

        //Multi thread: one object does the many tasks.
        //Garbage collector: It scans the memory constantly, when it sees an object does not have a pointer
        // it will remove it.



        String t ="Jdbc";
        String u = new String("Jdbc"); // this creates another String container in the Heap memory.

    /*1) String Class is "immutable" but sometimes we need "mutable" Strings because of that
Java created "StringBuilder" and "StringBuffer" classes

2)When you use "String str1 = "Java";"  to create a String, Java creates a "String Pool" in "Heap"
  memory and puts the str1 object inside the String Pool.

3)When you create a new String by using "String str2 = "Java";" Java will check the String Pool
  if there is an object whose value is same then Java does not create a new container, just points the
  existing one. Java does that to save memory.

4)When multiple pointers point the same object, any update on the object will affect all Strings
  we do not want it. To prevent all Strings to be updated Java created immutability.
  In immutability, existing object will not be updated, Java will create a new object with the new
  value then change the pointer to the new object.

5)If you want to create different objects with the same value, you have to use "new" keyword like
  "String u = new String("Jdbc");"

6)If any object does not have any pointer, Garbage Collector will delete it automatically to make the
  memory clean.

Note: If  you use "==" to compare Strings, it will check i)Value ii)Address.
      If both are same you will get true
Note:equals() method checks just the values not the addresses. If the values are same you will get true.
     When we work with Strings, we work with the values mostly, therefore we use "equals()" when we
     compare Strings
  */

        //Difference between Immutable and Mutable Classes
        StringBuilder sb1 = new StringBuilder("Tom");
        sb1.append("Hanks"); // append method appends the "Hanks" next to the "Tom".
        System.out.println(sb1);//When we print it, prints TomHanks
        //Mutable is updating the first value.

        String str = "Tom"; // String is immutable, so we can not update the original value.
        str = str.concat("Hanks");
        System.out.println(str);



        StringBuilder sb2 = new StringBuilder("Hanks");
        int numOfChars = sb2.length();
        System.out.println(numOfChars);//5

        int capacity = sb2.capacity();//21
        //When we create am String container Java gives us 16 boxes in the container.
        //In this case capacity all the time gives us 16 boxes. Hanks is 5 length long thats why capacity
        //gives us 21 for the result.


        StringBuilder sb4 = new StringBuilder("JavaJavaJava");
        int c =  sb4.capacity();
        System.out.println(c);



        //How to decide to capacity
        StringBuilder sb5 = new StringBuilder(2);
        sb5.append("FL!");
        int i =sb5.capacity();
        System.out.println(i); //6




        StringBuilder sb6 = new StringBuilder("Java World");
        sb6.delete(4,10);
        System.out.println(sb6);


        StringBuilder sb7 = new StringBuilder("Java World");
        sb7.deleteCharAt(4);
        System.out.println(sb7);


        StringBuilder sb8 = new StringBuilder("Java World");
        sb8.reverse();
        System.out.println(sb8);

        //How to convert a String to StringBuilder
        String str3 = "Java";
        StringBuilder sb9 = new StringBuilder(str3);
        sb9.reverse();
        System.out.println(str3);//Java ==> because it`s immutable
        System.out.println(sb9); //avaJ ==> because it`s mutable

        StringBuilder sb10 = new StringBuilder("Java is Love");
        sb10.substring(8); // Java is Love ==> because result is String (immutable)
        String newSb10 = sb10.substring(8);//Love
        System.out.println(newSb10);
        System.out.println(sb10);





        /**Immutable classes
         * String
         * All Wrapper Classes are Immutable(Integer, Boolean, Character...)
         */





















    }
}
