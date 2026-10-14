package Interfaces;
interface Zepto {
    int deliveryCharge = 30;
    void deliverFood();
    default void foodMessage() {
        System.out.println("Zepto delivered food sucessfully");
    }
}

interface Instamart {
    int groceryCharge = 20;
    void deliverGrocery();
    static void groceryMessage() {
        System.out.println("Instamart delivered groceries successfully");
    }
}
class Delivery implements Zepto, Instamart {
    String name = "Reeshika";
    int orderAmount = 500;
    public void deliverFood() {
        System.out.println("Food is being delivered");
        System.out.println("Total amount is " + (orderAmount + deliveryCharge));
    }
    public void deliverGrocery() {
        System.out.println("Grocery is being delivered");
        System.out.println("Total amount is " + (orderAmount + groceryCharge));
    }
    void displayDetails() {
        System.out.println("Customer name: " + name);
        System.out.println("Order amount: " + orderAmount);
    }
}

public class Interface5 {
    public static void main(String[] args) {
        Delivery d = new Delivery();
        d.displayDetails();
        d.deliverFood();
        d.deliverGrocery();
        d.foodMessage();
        Instamart.groceryMessage();
    }
}