package homeworks;

public class TypeCastingHomework {
    public static void main(String[] args) {
        /*
        1) Create a short variable and convert it to an int variable

        2) Create a long variable and convert it to an int variable

        3) Create a double variable and convert it to a float variable

        4) Create a double variable and convert it to a short variable, then print the value of the short variable on the console.
        Be careful about the output, it will not be a decimal value.

        5) Create a byte variable and convert it to a double variable, then print the value of the double variable on the console.
        Be careful about the output, it will be a decimal value.
          */
        //1) Auto Widening
        short myShortValue = 1234;
        int myIntValue = myShortValue;

        //2) Explicit Narrowing
        long myLongValue = 123123123;
        int myIntValue2 = (int)myLongValue;

        //3)Explicit Narrowing
        double myDoubleValue = 1231.123;
        float myFloatValue = (float)myDoubleValue;

        //4)Explicit Narrowing
        short myShortValue2= (short)myDoubleValue;
        System.out.println(myShortValue2);

        //5)Auto widening
        byte myByteValue = 12;
        double myDoubleValue2 = myByteValue;
        System.out.println(myDoubleValue2);

    }
}
