package practice_questions.week05;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /*
    - Type code to ask user to enter the int elements and add elements into the list
    - Ask user to enter the elements to remove, then remove that element from list.
    - Ask user to enter the element to update, then update it.
     */
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("To adds elements type 'add' \n" +
                    "To update elements type 'set' \n" +
                    "To remove elements type 'remove' \n" +
                    "To quit type 'exit'");
            String answer = input.next();
            if (answer.equalsIgnoreCase("exit")) {
                break;
            }
            switch (answer.toLowerCase()){
                case "add":
                    System.out.println("Enter an integer");
                    int element = input.nextInt();
                    list.add(element);
                    System.out.println(list);
                    break;
                case "set":
                    System.out.println("Which number you want to update");
                    int elementIndex = input.nextInt();
                    System.out.println("Enter the new number");
                    int update = input.nextInt();
                    int elementToUpdate = list.indexOf(elementIndex);
                    list.set(elementToUpdate,update);
                    System.out.println(list);
                    break;
                case "remove":
                    System.out.println("Which number do you want to remove?");
                    int delete = input.nextInt();
                    list.remove(list.indexOf(delete));
                    System.out.println(list);
                case "exit":
                    System.out.println("Good Bye");
                    break;

                default:
                    System.out.println("Enter a valid option");
                    break;
            }
        }

    }
}
