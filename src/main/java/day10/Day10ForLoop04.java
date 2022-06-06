package day10;

public class Day10ForLoop04 {
    public static void main(String[] args) {
          /*
              Week: 1
                Day: 1
                Day: 2
                Day: 3

              Week: 2
                Day: 1
                Day: 2
                Day: 3
          */

        int weeks = 4;
        int days= 7;

        for (int i = 1; i <= weeks; i++) {

            System.out.println("Week: " + i);

            for (int j = 1; j <= days; j++) {
                System.out.println("Day: " + j);
            }
        }
    }
}
