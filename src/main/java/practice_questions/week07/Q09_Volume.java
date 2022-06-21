package practice_questions.week07;

public class Q09_Volume {
        //Create a method to calculate volume of cube, square prism and rectangular prism.
    public double calculateVolume(double side){
        return side*side*side;
    }
    public double calculateVolume(double side, double height){
        return side*side*height;
    }
    public double calculateVolume(double side,double height, double width){
        return side*height*width;
    }
}
