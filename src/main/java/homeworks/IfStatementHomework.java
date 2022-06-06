package homeworks;

public class IfStatementHomework {
    public static void main(String[] args) {
        /*
        * Type code to print
        * a) Winter for december,january,february
        * b)spring for march, april, may
        * c) summer for june, july, august
        * d) fall for september, october, november
        * e)invalid month name for all the others  */

//        String myTime = "asd".toLowerCase();
//
//        switch (myTime)
//        {
//            case "winter":
//                System.out.println("December,January,February");
//                break;
//            case "spring":
//                System.out.println("March, April, May");
//                break;
//            case "summer":
//                System.out.println("June,July,August");
//                break;
//            case "fall":
//                System.out.println("September, October, November");
//                break;
//            default:
//                System.out.println("Invalid month name");
//                break;
//
//
//        }

        /*
        * Type code to print
        * a) "Valid Password" if the password has at least 8 characters different from space character
        * b) "Do not use space character in password" if the password has any space character in any position
        * c) "Invalid Password" if a and b conditions are not satisfied
        * Note: Be careful about the orders of conditions in the solution
        * */

//        String password = "123456        as";
//
//        if (password.replaceAll("\\s","").length()>0) {     // \\s means "space" button on keyboard.
//             System.out.println("Do not use space character in password");
//        }else if (password.replaceAll("\\s","").length() >= 8) {
//            System.out.println("Valid Password");
//        }else {
//            System.out.println("Invalid Password");
//        }

/*Type code to print
 a) "Round up by last digit:" and print the rounded value if the last digit is greater than
 or equal to 5
 b) "Round down by last digit" and print the rounded value if the last digit is less than 5*/

//        int num = 1;
//
//        if(num%10>=5){
//            System.out.println("Round up by last digit:" + (num/10+1)*10);
//        }else{
//            System.out.println("Round down by last digit:" + (num/10)*10);
//        }


        /*
        * Type code to check the grammatical rules for full name
 a) Your code should print "Error in initials" for "ali Can", "Ali can", "ali can"
 b) Your code should print "First name or last name missed" for single words like
 "Ali" or "Can" or "ali"
 c) Your code should print "Format error" for all the format like "ALI CAN"
 d) Your code should print "Name was not entered" for one or more space
 characters like " " or " "
 e) Your code should print "Invalid Name" if the name has any character different
 from letters and space.*/


        String fullName = "Ali Can";

        String initialOfFirstName = fullName.substring(0,1);

        Integer indexOfSpace = fullName.trim().indexOf(' ');

        String initialOfLastName = fullName.substring(indexOfSpace+1,indexOfSpace+2);

        Boolean isFirstNameInitialUpperCase = (initialOfFirstName.charAt(0)>='A'&& initialOfFirstName.charAt(0)<='Z');
        Boolean isLastNameInitialUpperCase = (initialOfLastName.charAt(0)>='A'&& initialOfLastName.charAt(0)<='Z');

        if(indexOfSpace==-1){
            System.out.println("First name or last name missed");
        }
        if (!isFirstNameInitialUpperCase || !isLastNameInitialUpperCase) {
            System.out.println("Error in initials");
        }
        if (fullName.equals(fullName.toUpperCase())) {
            System.out.println("Format error");
        }
        if (fullName.replaceAll("\\s","").length()==0) {
            System.out.println("Name was not entered");
        }
        if (fullName.replaceAll("\\s","").replaceAll("[A-Z,a-z]","").length()>0 )
        {
            System.out.println("Invalid Name");
        }






















    }
}
