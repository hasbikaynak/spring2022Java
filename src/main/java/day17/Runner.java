package day17;

public class Runner {
    public static void main(String[] args) {
        /*Create unique student ids for every registered student
         * Tom Hanks registered to Math Course(901) == TH20229011001     */

        StaticKeyword03 std1 = new StaticKeyword03();
        System.out.print(StaticKeyword03.getInitials("Tom Hanks"));
        System.out.print(StaticKeyword03.getYear());
        System.out.print(StaticKeyword03.getCourseName("Math"));
        StaticKeyword03.showCounter();

        System.out.println();

        StaticKeyword03 std2 = new StaticKeyword03();
        System.out.print(StaticKeyword03.getInitials("Jeremy Thomson"));
        System.out.print(StaticKeyword03.getYear());
        System.out.print(StaticKeyword03.getCourseName("art"));
        StaticKeyword03.showCounter();


    }
}
