package homeworks;

public class WrapperClassHomework {
    /*
    1) Type code to find the sum of the minimum value of the byte and the maximum of short data types.

    2) Type code to convert "103" String to byte and to convert "2351" String to short then print the difference on the console.

    3) What are the differences between valueOf(String s) and parseByte(String s) methods?
     */


    public static void main(String[] args) {
        //1)
       byte byteMinValue = Byte.MIN_VALUE;
       short shortMaxValue = Short.MAX_VALUE;
        System.out.println(byteMinValue + shortMaxValue);

        //2)
        String stringValue1 = "103";
        byte byteValue = Byte.valueOf(stringValue1);

        String stringValue2 = "2351";
        short shortValue = Short.valueOf(stringValue2);

        System.out.println(shortValue - byteValue);


        //3) parseByte() returns primitive integer type(int), whereas valueOf() returns java.lang.Integer, which is the object representative of the integer.
        // There are circumstances where you might want an Integer object, instead of a primitive type.
        //Of course, another obvious difference is that valueOf() is an instance method whereas parseByte() is a static method.

    }
}
