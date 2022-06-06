package day03;

public class Day03ObjectCreation {
    public static void main(String[] args) {


        Day03ObjectCreation c = new Day03ObjectCreation();

        System.out.println(c.calculateDateOfBorn(25));
        System.out.println(c.printName("Mehmet","Kaynak"));
        System.out.println(c.height);
        System.out.println(c.id);

    }

    public String printName(String firstname, String lastname)
    {
        return  firstname + " " + lastname;
    }

    public int calculateDateOfBorn(int Age)
    {
        return 2022-Age;
    }

    int height = 165;
    String id = "Some Random Characters";
}
