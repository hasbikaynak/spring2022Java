package day18;

public class PassByValuePassByReference {
    public static void main(String[] args) {
        int shirt = 100; //pass by value => java creates a copy of shirt value and sends it to the method calls.
        System.out.println(countDiscount("veterans",shirt));
        System.out.println(countDiscount("students",shirt));
        System.out.println(countDiscount("seniors",shirt));

        String greeting = "Woooow"; //Java does not use the pass by reference in order to protect original value!!!
        System.out.println(addExclamationMark(greeting));
        System.out.println(greeting);


//        1)Java creates copy of values in method calls to protect original value of the variables.
//  That process is called "Pass By Value".
//2)By the help of the "Pass By Value", we are able to protect original value.
//3)Some programming languages may use "Pass By Reference", if you use that kind of languages be careful about
//  protecting original values.


    }
    public static int countDiscount(String status, int price){
        switch (status){
            case "students":
                price= price-10;
                break;
            case "veterans":
                price= price-20;
                break;
            case "seniors":
                price= price-5;
                break;
            default:
                price = price;
        }
        return price;
    }

    public static String addExclamationMark(String greetings){
        return greetings + "!";
    }
}
