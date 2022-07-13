package day28;

public class E06 {
    public static void main(String[] args) {
      //  ClassCastException ==> Runtime error
    }

    public static void testing(){
        try{
            System.out.println(1+1);
        }catch (ClassCastException e){
            System.out.println("Do some action");
        }finally {
            System.out.println("break the connection"); // finally blog works every time when we execute the code.
        }
    }

}
