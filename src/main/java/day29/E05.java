package day29;

public class E05 {
    /*
    What is the difference between exception and error?
    Exceptions can be handled, your app can work after handling exception.
    Errors cannot be handled, your app can not work after getting any error

    Note 1: Exceptions and Errors are the child of the Throwable class
    Common Errors:
    OutOfMemoryError: If the heap memory is full it occurs.
    StackOverFlowError: If the stack memory is full it occurs.
    LinkageError: If the dependant class has any issue it occurs.

    Custom Exceptions:
    We can create our own exception classes they can be checked(CTE) exception or unchecked(RTE) exception.
    To be able to create Custom Exception gives us flexibility.
    To be able to create Custom Exception protect the application from developer mistakes.
     */
    public static void main(String[] args) throws IllegalGradeException {
//        int grade = 120;
//        if (grade > 100 || grade < 0) {
//            throw new IllegalGradeException("Grades must be from 0 to 100");
//        }
//        else {
//            System.out.println("Your grade is "+grade);
//        }


        int age = -12;
        if (age < 0) {
            throw new IllegalAgeException("Age cannot be negative");
        }
    }
}
//How to create custom checked exception class?
/*
 Make the class child of the Exception Class
 Use String Message parameter in the constructor
 Create toString() method to be able to see the message when the exception was thrown
 */
class IllegalGradeException extends Exception{
    String message;

    public IllegalGradeException(String message)
    {this.message = message;}


    public String getMessage() {
        return message;
    }
}
class IllegalAgeException extends  RuntimeException{
    String message;

    public IllegalAgeException(String message)
    {this.message = message;}


    public String getMessage() {
        return message;
    }
}