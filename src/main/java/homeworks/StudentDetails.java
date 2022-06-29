package homeworks;

import java.util.Arrays;

public class StudentDetails {
    //Student Details Arrays
    private String[] names = {"Tom - 1","Angela - 2","Ramesh - 3","Michelle - 4","Bartek - 5"};
    private double[] marks = {4.75,3.45,2.76,4.38,3.09};
    private String[] section = {"Computer Science","Engineering","Law","Gastronomy","International Management"};
    public static void getStudentDetail(int studentNumber){
        StudentDetails studentDetails = new StudentDetails();
        System.out.println("Below shown the students names and their numbers.");
        System.out.println(Arrays.toString(studentDetails.getNames())); //[Tom, Angela, Ramesh, Michelle, Bartek]
        int studentNumberIndex = studentNumber -1; //2
        for (int i = 0; i < studentDetails.getNames().length; i++) {
            if (i == studentNumber) {
                System.out.println("Details for the student: "+
                        "\nStudent Name and the number of the student: "+ studentDetails.getNames(studentNumberIndex)+
                        "\nStudent Mark: "+ studentDetails.getMarks(studentNumberIndex)+
                        "\nStudent Section: "+studentDetails.getSection(studentNumberIndex));
            }
        }
    }
    //Getters
    public String[] getNames() {
        return names;
    }
    public String getNames(int index) {
        return names[index];
    }
        public double getMarks(int markIndex) {
        return marks[markIndex];
    }
    public String getSection(int sectionIndex) {
        return section[sectionIndex];
    }
}
