package practice_questions.week10;

public class Q03_BMI {
    private double weight;
    private double height;

    public Q03_BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void calculateBMI(){
        double BMI = weight/(height*height);

        if (BMI >= 0 && BMI < 18.5) {
            System.out.println("Underweight");
        }
        else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Normal weight");
        }
        else if (BMI >= 25 && BMI < 30) {
            System.out.println("Overweight");
        }
        else if (BMI >= 30 ) {
            System.out.println("Obese");
        }
        else {
            System.out.println("Enter valid number");
        }
        System.out.println(BMI);
    }

        /*
    Type code to calculate BMI (Do NOT ignore security).
    The BMI is defined as the body mass divided by the square of the body height.
    Major adult BMI classifications are underweight (under 18.5 kg/m2), normal weight (18.5 to 24.9), overweight (25 to 29.9), and obese (30 or more).
    */



}
