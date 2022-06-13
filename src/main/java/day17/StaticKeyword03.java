package day17;

import java.time.LocalDate;

public class StaticKeyword03 {
          public static int counter = 1000;
          public StaticKeyword03(){
              counter++;
          }

    public static int getCourseName(String courseName){

        int courseCode =0;
        switch (courseName.toLowerCase()){
            case "math":
                courseCode = 901;
                break;
            case "science":
                courseCode = 902;
                break;
            case "art":
                courseCode = 903;
                break;
            case "computer":
                courseCode = 904;
                break;
            default:
                System.out.println(courseName + " does not exist!!!");
        }

        return courseCode;
    }
    public static int getYear(){
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        return  year;
    }

    public static String getInitials(String studentName){
        String firstInitial = studentName.split(" ")[0].substring(0,1).toUpperCase(); //T
        String lastNameFirstInitial = studentName.split(" ")[1].substring(0,1).toUpperCase();//H
        return firstInitial + lastNameFirstInitial;
    }

    public static void showCounter()
    {
        System.out.print(counter);
    }
}
