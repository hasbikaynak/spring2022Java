package practice_questions.week10;

public class Store {
    //Make a public setter and getter for Store class so its values can be accessed by other classes. And print the Store name and address and change their values again print them.

   private String storeName;
   private String address;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Store(String storeName, String address) {
        this.storeName = storeName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeName='" + storeName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
