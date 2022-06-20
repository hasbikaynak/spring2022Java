package practice_questions.week07;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
        * Type a simple 5-item grocery shopping program.
    1st Step: Select a product from the product list and ask how much it weighs.
    2nd Step: Ask if he/she wants to buy another item.
               If she/he does not want it, show the total amount, if she/he does, select the product again.
   3rd Step: Each time the customer selects an item, add the price of the item they bought to the total price.
   4th Step: Show the total amount to be paid when the shopping is over.*/
public class Q03 {

      static List<String> productList = Arrays.asList("Tomato - Product Code: 1","Apple - Product Code: 2","Melon - Product Code: 3","Strawberry - Product Code: 4","Potato - Product Code: 5");
      static List<Double> priceList = Arrays.asList(1.09,0.7,2.5,3.05,1.5);
      static double totalAmount;
      static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
       buyProduct();
    }

    public static void buyProduct(){
        System.out.println("Product List:" + "\n"+productList);
        System.out.println("Product Price List: "+ "\n"+priceList);
        System.out.println("Type the Product Code that you want to buy");
        int productCode = input.nextInt();
        System.out.println("How many kilograms you want to buy?");
        double weight = input.nextDouble();
        var productPrice = priceList.get(productCode-1) * weight;
        totalAmount += productPrice;

        System.out.println("The product you chose " + productList.get(productCode-1));
        System.out.println("Product price " + productPrice);
        System.out.println("To continue to shop type 1, to go to the grocery checkout enter 2");
        int decision = input.nextInt();

        if (decision == 1) {
            buyProduct();
        }
        else{
            groceryCheckout();
        }
    }

    public static void groceryCheckout(){
          System.out.println("Total amount "+totalAmount);
//        System.out.printf("%.2",totalAmount);// in order to show user 2 decimal part
    }
}
