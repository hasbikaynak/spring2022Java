package practice_questions.week07;
import java.time.LocalDate;

public class Q12_Market {
        //Type a supermarket program to see product name, product price and expiration date.
    String productName;
    double productPrice;
    String expirationDate;

    public Q12_Market(String productName, double productPrice, int monthsLater) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.expirationDate = LocalDate.now().plusMonths(monthsLater).toString();
    }
    public Q12_Market(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.expirationDate = "This product does not have expiration date";
    }
}
