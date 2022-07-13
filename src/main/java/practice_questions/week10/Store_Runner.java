package practice_questions.week10;

public class Store_Runner {
    public static void main(String[] args) {
        Store store1 = new Store("Crocodile" , "USA street");
        System.out.println(store1);

        store1.setStoreName("H&M");
        store1.setAddress("Miami street");
        System.out.println(store1);
    }
}

//