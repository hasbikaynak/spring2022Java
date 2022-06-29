package practice_questions.week09;

public class Q03_Runner {
    //Create a Java programme to calculate the volume of cylinder and rectangular prism. (Use inheritance)
    public static void main(String[] args) {
        Q03_Volume volume = new Q03_Volume();
        System.out.println("Volume of the Cylinder is: " + volume.volumeOfCylinder(5,10));
        System.out.println("Volume of the Rectangular is: " + volume.volumeOfRectangularPrism(5,10,10));
    }
}
