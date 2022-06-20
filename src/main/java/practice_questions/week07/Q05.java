package practice_questions.week07;

public class Q05 {
    public static void main(String[] args) {
        /*
        Take the exam point from user and print the grade on console by using switch statement according to the rules below:
          F--> (0.00 - 1.00)
          D--> (1.00 - 2.00)
          C--> (2.00 - 2.50)
          B--> (2.50 - 3.50)
          A--> (3.50 - 4.00)
          (Firsts inclusive - Seconds exclusive)
         */
        double score = 3.43;
        String grade = "";

        if (score >= 0 && score < 1) {
            grade = "Fail";
        } else if (score >= 1 && score < 2) {
            grade = "Pass";
        } else if (score >= 2 && score < 2.5) {
            grade = "Good";
        }else if (score >= 2.5 && score < 3.5) {
            grade = "Superior";
        }else if (score >= 3.5 && score <= 4) {
            grade = "Excellent";
        }

        switch (grade){
            case "Fail":
                System.out.println("F");
                break;
            case "Pass":
                System.out.println("D");
                break;
            case "Good":
                System.out.println("C");
                break;
            case "Superior":
                System.out.println("B");
                break;
            case "Excellent":
                System.out.println("A");
                break;
            default:
                System.out.println("Enter a valid point");
        }
    }
}
