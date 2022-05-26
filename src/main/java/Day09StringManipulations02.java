import java.util.Scanner;

public class Day09StringManipulations02 {
    public static void main(String[] args) {
            /*
            Check if a password has the following conditions
              i)It should not be empty
              ii)It should not be just a single space
              iii)It should not have spaces at the beginning and at the end
              iv)'i' should be a character in the password and first occurrence of 'i' should be at index 4
              v)'K' should be a character in the password and last occurrence of 'K' should be at index 5
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password");
        String pwd = input.nextLine();

        //isEmpty() method checks the String if it is empty or not.
        //If the String is empty it will return true, otherwise it will return false
        if(!pwd.isEmpty()){
            System.out.println("Password is not empty");
        }else{
            System.out.println("Password should not be empty");
        }
        //Returns true if the string is empty or contains only white space codepoints, otherwise false
        if(!pwd.isBlank()){
            System.out.println("Password is not space");
        }else{
            System.out.println("Password should not be space");
        }
        if(pwd.length()>0 && pwd.length()==pwd.trim().length()){
            System.out.println("Password has no space at the beginning and at the end");
        }else{
            System.out.println("Password should not have spaces at the beginning and at the end");
        }
        if(pwd.indexOf("i")==4){
            System.out.println("Password has 'i' at index 4");
        }else{
            System.out.println("Password should have 'i' at index 4");
        }
        if(pwd.lastIndexOf("K")==5){
            System.out.println("Password has 'K' at index 5");
        }else{
            System.out.println("Password should have 'K' at index 5");
        }
    }
}