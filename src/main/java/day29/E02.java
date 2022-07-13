package day29;

import java.io.FileInputStream;
import java.io.IOException;

public class E02 {
    /*
    throws keyword is used in method signature(name + method parameters) line
    if you used child/parent after throws keyword, Java will let you use just the parent
    after throws keyword multiple exceptions can be used.
    after throws keyword we do not use new keyword and constructor, we use just the Exception Class name
    filenotfoundexception is thrown by java if the path is wrong or the file does not exist

    ioexception handles all issues related with input and output operations
    ioexception is the parent of the filenotfoundexception.
     */
    public static void main(String[] args) throws IOException {
        String textFile01 = "src/main/java/day29/TextFile01";

        FileInputStream fis = new FileInputStream(textFile01); // Compile time Exception
        int ASCII = 0;
        while ((ASCII=fis.read()) != -1 ){
            System.out.print((char) ASCII);
        }
    }
}
