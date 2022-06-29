package practice_questions.week08;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;
import java.util.Scanner;

public class Student_Runner {
        public static void main(String[] args) {

            List<Student> studentList = new ArrayList<>();
            studentList.add(new Student("Hasbi",4.20,"Computer Science"));
            studentList.add(new Student("Mehmet",3.15,"Engineer"));
            studentList.add(new Student("Tom",4.32,"Art"));
            studentList.add(new Student("Angelika",2.20,"Architecture"));
            studentList.add(new Student("Bartek",1.97,"IT"));


            Scanner input = new Scanner(System.in);
            System.out.println("Search Student name and Student`s details");
            String studentName = input.nextLine();
            for (Student w:studentList) {
                if (w.getName().equalsIgnoreCase(studentName)) {
                    System.out.println("Student Name: " + w.getName()+
                    "\nStudent Mark: " + w.getMark()+
                            "\nStudent Section: " + w.getSection());
                }
            }
        }
}