package practice_questions.week05;

public class Q09 {
    public static void main(String[] args) {
        /*
     Type a code to display the number of days in a given month of a given year.
                Example: The number of days in February 2000 was 29.
     */

        int month = 3;
        int year = 2000;
        int day = 30;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day=30;
                break;
                case 2:
                if (year%4==0&&year%100!=0 || year%400==0) {
                    day=29;
                }
                else {
                    day=28;
                }
                break;
            default:
                System.out.println("Invalid Input!!!");
        }
        System.out.println("Number of days: " + day);
    }
}
