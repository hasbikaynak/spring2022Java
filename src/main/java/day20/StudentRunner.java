package day20;

public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student(); // Tom Hanks
        System.out.println(student1);

        student1.setName("Andy Smart");
        student1.setAge(24);
        student1.setSuccessful(false);
        System.out.println(student1);

        student1.setName("Mary Star");
        student1.setAge(22);
        student1.setSuccessful(false);
        System.out.println(student1);


        Student std2 = new Student();
        System.out.println(std2);//Student{name='Tom Hanks', age=13, successful=true}

    }
}
