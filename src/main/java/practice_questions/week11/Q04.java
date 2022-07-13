package practice_questions.week11;

import java.util.HashMap;

public class Q04 {
    /*
        Print two arrays which contains firstname and lastname as the format : firstname=lastname
            input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
            output : {John=Doe, Mark=Twain, Ali=Can};
         */
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();

        String[] firstname = {"John","Mark","Ali"};
        String[] lastname = {"Doe","Twain","Can"};

        for (int i = 0; i < firstname.length; i++) {
            hashMap.putIfAbsent(firstname[i],lastname[i]);
        }

        System.out.println(hashMap);
    }
}
