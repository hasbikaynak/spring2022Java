package Homeworks;

public class StringManipulationsHomework {
    public static void main(String[] args) {
        /*Create a String variable for city names which have just a single word.
Print the city name with the initial is in uppercase and all the other characters
are in lower cases on the console.
Example: mIAMI should be printed as Miami
 miami should be printed as Miami
 MIAMI should be printed as Miami
 mIaMi should be printed as Miami etc
 */

//        String city = "MIAMI";
//
//       String updatedCityName = city.trim().toLowerCase();
//
//       updatedCityName = updatedCityName.substring(0,1).toUpperCase() + updatedCityName.substring(1);
//
//        System.out.println(updatedCityName);


        /*
        Create 3 String variables for people's names. Print the sum of the number of characters in
all the 3 names except space characters.
Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.
        * */

        String name1 = "Ali Can";
        String name2 = "Merve Star";
        String name3 = "Mark Tom";

        String updatedName1 = name1.replaceAll("\\s","");
        String updatedName2 = name2.replaceAll("\\s","");
        String updatedName3 = name3.replaceAll("\\s","");


        int name1Length = updatedName1.length();
        int name2Length = updatedName2.length();
        int name3Length = updatedName3.length();

        System.out.println(name1Length + name2Length + name3Length);









    }
}
