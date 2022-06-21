package practice_questions.week07;

public class Q12_MarketRunner {
    public static void main(String[] args) {
        Q12_Market product1 = new Q12_Market("Milk",1.5,1);
        System.out.println(product1.productName + " " + "€"+product1.productPrice + " " + product1.expirationDate);

        Q12_Market product2 = new Q12_Market("Keyboard",10.05);
        System.out.println(product2.productName + " " + "€"+product2.productPrice +" "+ product2.expirationDate);

    }
}
