import java.time.LocalDateTime;
import java.util.Scanner;

public class Day10StringManipulations01 {
    public static void main(String[] args) {
        // Ask user to enter his/her full name, then create a unique ID for the user
        //ID should contain first 2 characters of the first name and last 2 characters of the last name.
        //Use the current date time at the end of the id
        //Tom Hanks ==> id = Toks20220528110434

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name...");

        String fullName = input.nextLine();

        String first2InitialsOfName =  fullName.substring(0,2); //To
        String last2InitialsOfLastName =  fullName.substring(fullName.length()-2); //ks

        LocalDateTime currentDateTime = LocalDateTime.now();
        String currentDateTimeUpdated = currentDateTime.toString().substring(0,19).replaceAll("[^0-9]",""); //20220528172504

        System.out.println(first2InitialsOfName + last2InitialsOfLastName + currentDateTimeUpdated);

    }
}
