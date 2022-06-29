package practice_questions.week08;

public class Student {

    private String name;
    private double mark;
    private String section;

    public Student(String name, double mark, String section) {
        this.name = name;
        this.mark = mark;
        this.section = section;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public double getMark() {
        return mark;
    }

    public String getSection() {
        return section;
    }
}
