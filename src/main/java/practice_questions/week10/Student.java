package practice_questions.week10;

public class Student {
    //studentName studentRollNum
    String studentName;
    String studentNumber;

    public Student(String studentName, String studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Tom", "9001");
        System.out.println(student1.studentName+ " "+ student1.studentNumber);
    }


}
