public class Day10ForLoop06 {
    public static void main(String[] args) {
        // Find the sum of the digits of decimal part in a double number
        // 23.1528 ==> 1+5+2+8 = 16

        double d = 23.1528;

        String sd = String.valueOf(d);

        //1. Way to get decimal part
//        int index = sd.indexOf(".")+1;
//
//        String decimalPart = sd.substring(index); // String 1528
//        System.out.println(decimalPart);

        //2. Way to get decimal part

        String decimalPart = sd.split("\\.")[1];
        int decimalPartInt = Integer.valueOf(decimalPart);


        System.out.println(decimalPart);


//        int decimalPartInt = Integer.valueOf(decimalPart); // Integer 1528 if we want to do mathematical operations we should use Integer value
//        System.out.println(decimalPartInt);
//
        int sum = 0;

        for (int i = decimalPartInt; i > 0 ; i=i/10) {
            sum = sum + i%10;
        }
        System.out.println(sum);

    }
}
