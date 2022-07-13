package day29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03 {
    public static void main(String[] args)  {
        try {
            FileInputStream  fis = new FileInputStream("src/main/java/day29/TextFile01");
            int ASCII;
            while((ASCII=fis.read()) != -1){
                System.out.print((char) ASCII);
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
