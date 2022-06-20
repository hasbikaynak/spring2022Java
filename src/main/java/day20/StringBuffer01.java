package day20;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class StringBuffer01 {
    public static void main(String[] args) {
        /*
        * 1) String class gives you immutable Strings, if you need mutable Strings you can use StringBuilder or StringBuffer classes.
        * mutable => you can update the original value. StringBuilder and StringBuffer
        * immutable => you can not update the new value.
        *
        * 2) When Java was created, Java created "StringBuffer" class. But then in Java 1.5, StringBuilder came to the stage.
        *
        *3) StringBuffer class is multi-thread and synchronized but StringBuilder is not multi-thread and synchronized.
         Java did that to make StringBuilder to provide faster mutable Strings to developers.
         *
         * 4) When to use String, StringBuilder, StringBuffer?
         * String: If you want to operate small amount of data use "String".
         * StringBuilder: If you need single thread operations with large data in fast pace use "StringBuilder".
         * StringBuffer: Multi-thread operations with large amount of data needs "StringBuffer".
         *
        * */
        String str = "Anan";

        LocalDateTime time1 = LocalDateTime.now(); // get the current time before the methods.
        performanceOfStringBuffer(str);
        LocalDateTime time2 = LocalDateTime.now();
        performanceOfStringBuilder(str);
        LocalDateTime time3 = LocalDateTime.now();
        //How to check performance

        System.out.println("String Buffer time: " + time1.until(time2, ChronoUnit.NANOS));
        System.out.println("String Buffer time: " + time2.until(time3, ChronoUnit.NANOS));


        /**
          When we use multi-thread: While we talk by phone by whatsapp, at the same time we can send images, voice transfer, message transfer, accepting new call,sharing location.
          in an app doing multi-tasks.
         Multi-thread: prevents freezing of the application
         it has risks. Every time multi-thread executes the codes. Output can be different everytime.
         To solve that issue, Java created synchronization!!!
         Synchronized Methods locks the task until it`s done and then the next method will take the stage and is gonna locked on it. When it`s execution completed, it will be unlocked ,and it will go to the next method.


         */
    }

    public static StringBuffer performanceOfStringBuffer(String str){
        StringBuffer strBuffer = new StringBuffer(str);
        for (int i = 0; i < 10000; i++) {
            strBuffer.append("31");
        }
        return strBuffer;
    }

    public static StringBuilder performanceOfStringBuilder(String str){
        StringBuilder strBuilder = new StringBuilder(str);
        for (int i = 0; i < 1000; i++) {
            strBuilder.append("62");
        }
        return strBuilder;
    }
}
