package day31;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Functional_Programming04 {
    public static void main(String[] args) {
        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);

        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(isAllAverageScoresGreaterThanGivenNumber(coursesList,92));
        System.out.println(isOneOfCourseNamesContainsTheGivenWord(coursesList,"Day"));
        System.out.println(printHighestAverageScoreCourse(coursesList));
        System.out.println(skipFirstGivenAndSortTheListInAscendingOrder(coursesList,1));
    }
    //1)Create a method to check if all average scores are greater than given number
    public static boolean isAllAverageScoresGreaterThanGivenNumber(List<Courses> list, int averageScore){
       return list.stream().allMatch(t->t.getAverageScore()>averageScore);
    }

    //2)Create a method to check if at least one of the course names contains given word
    public static boolean isOneOfCourseNamesContainsTheGivenWord(List<Courses>list, String word){
        return list.stream().anyMatch(t->t.getCourseName().contains(word));
    }

    //3)Create a method to print the course whose average score is the highest
    public static String printHighestAverageScoreCourse(List<Courses> list){
       return list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
    }

    //4)Sort the list elements according to the average score in ascending order and skip first given
    public static List<Courses> skipFirstGivenAndSortTheListInAscendingOrder(List<Courses> list, long num){
       return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(num).collect(Collectors.toList());
    }
}
