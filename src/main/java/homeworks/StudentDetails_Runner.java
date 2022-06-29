package homeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDetails_Runner {

    static List<String> names = new ArrayList<>();
    static List<Double> marks = new ArrayList<>();
    static List<String> section = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static Scanner newInput = new Scanner(System.in);
    static int userAnswer;
    public static void main(String[] args) {


        names.add("Mehmet");
        marks.add(3.5);
        section.add("Science");
        names.add("Tom");
        marks.add(3.2);
        section.add("Computer Science");
        names.add("Angelika");
        marks.add(4.5);
        section.add("Art");
        names.add("Maria");
        marks.add(2.6);
        section.add("International Relationship");
        names.add("Gordon");
        marks.add(3.9);
        section.add("Management");

        bringMenu();


    }
    private static void bringMenu(){
        do {
            System.out.println("Welcome to Student Detail application");
            System.out.println("Enter number 1, in order to add a new student into our system");
            System.out.println("Enter number 2, in order to update the name for the existing student");
            System.out.println("Enter number 3, in order to update the grade for the existing student");
            System.out.println("Enter number 4, in order to update the study of field for the existing student");
            System.out.println("Enter number 5, in order to delete a existing student from our system");
            System.out.println("Enter number 6, in order to learn the student details");
            System.out.println("Enter number 7, in order to exit the program");
            userAnswer = input.nextInt();
            bringSwitch();
        } while (userAnswer != 7);
    }
    private static void bringSwitch(){
        switch (userAnswer){
            case 1:
                getNewStudentName();
                getNewGrade();
                getNewField();
                showLastAddStudentInfo();
                break;
            case 2:
                checkStudentNameAndUpdate();
                break;
            case 3:
                checkStudentNameAndUpdateGrade();
                break;
            case 4:
                checkStudentNameAndUpdateField();
                break;
            case 5:
                deleteStudent();
                break;
            case 6:
                showAllTheList();
                break;
            case 7:
                System.out.println("Good bye!!!");
                break;
            default:
                System.out.println("Invalid input!!!");
        }
    }

    private static void getNewStudentName(){
        System.out.println("Please enter the new student name");
        String newStudentName = input.next();
        String firstInitial = newStudentName.substring(0,1).toUpperCase();
        String remainingInitialsName = newStudentName.substring(1).toLowerCase();
        names.add(firstInitial+remainingInitialsName);
    }

    private static void getNewGrade(){
        System.out.println("Please enter the student grade out of 0.0 to 5.0");
        double newStudentGrade = input.nextDouble();
        if (!(newStudentGrade >= 0.0 && newStudentGrade <=5.0)) {
            System.out.println("Invalid grade range");
        }
        marks.add(newStudentGrade);
    }

    private static void getNewField() {
        System.out.println("Please enter the field of study");
        String newStudentFieldStudy = newInput.nextLine();
        section.add(newStudentFieldStudy);
    }

    private static void showLastAddStudentInfo(){
        String getNewStudentName = names.get(names.size()-1);
        double getNewStudentGrade = marks.get(marks.size()-1);
        String getNewStudentSection = section.get(section.size()-1);

        System.out.println("\nNew Student has been added into our system. The student`s details:" +
                "\nStudent Name: "+getNewStudentName+
                "\nStudent Grade: "+getNewStudentGrade+
                "\nStudent`s field of study: "+getNewStudentSection);
    }
    private static void checkStudentNameAndUpdate(){
        System.out.println("Those are the registered students to our system "+names);
        System.out.println("Please type the Student name that you want to update");
        String updateStudent = input.next();
        for (String w:names) {
            if (w.equalsIgnoreCase(updateStudent)) {
                System.out.println("Please enter the new name");
                String newStudent = newInput.nextLine();
                names.set(names.indexOf(w), newStudent);
                System.out.println("After the changes the new list: ");
                showAllTheList();
            } else {
                System.out.println("Student not found");
            }
        }
    }

    private static void checkStudentNameAndUpdateGrade(){
        System.out.println("For which student do you want to update the grade?");
        String updateStudent = input.next();
        for (String w:names) {
            if (w.equalsIgnoreCase(updateStudent)) {
                System.out.println("Please enter the new grade");
                double newGrade = newInput.nextDouble();
                marks.set(names.indexOf(w), newGrade);
                System.out.println("After the changes the new list: ");
                showAllTheList();
            } else {
                System.out.println("Student not found");
            }
        }
    }

    private static void checkStudentNameAndUpdateField(){
        System.out.println("For which student do you want to update the field?");
        String updateStudent = input.next();
        for (String w:names) {
            if (w.equalsIgnoreCase(updateStudent)) {
                System.out.println("Please enter the new field");
                String newField = newInput.nextLine();
                section.set(names.indexOf(w), newField);
                System.out.println("After the changes the new list: ");
                showAllTheList();
            } else {
                System.out.println("Student not found");
            }
        }
    }


    private static void deleteStudent(){
        System.out.println("Type the student name that you want to delete");
        String deleteStudent = newInput.nextLine();

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase(deleteStudent)) {
                names.remove(i);
                marks.remove(i);
                section.remove(i);
                i--;
                showAllTheList();
            }
        }
    }


    private static void showAllTheList(){
        System.out.println(names);
        System.out.println(marks);
        System.out.println(section);
    }
}
