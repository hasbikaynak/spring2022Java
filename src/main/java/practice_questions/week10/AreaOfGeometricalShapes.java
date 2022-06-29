package practice_questions.week10;

public class AreaOfGeometricalShapes extends Area{


    @Override
    public double areaOfRectangle(double length, double weight) {
        return length * weight;
    }

    @Override
    public double areaOfTriangle(double base, double height) {
        return (height*base)/2;
    }

}
