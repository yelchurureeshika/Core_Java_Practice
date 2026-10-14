package methods;
class Product{
    String name="ice cream";
    double price=100;
    int quantity=3;
    double total_price;

    void display(){
        System.out.println("Product Details: "+ name+" "+price+" "+quantity);
    }
    void totalPrice(){
        total_price= price*quantity;
        System.out.println("total price:"+total_price);
    }
    void offer(){
        if(total_price>=500){
            System.out.println("total price after discount:"+(total_price-100));
        }
        else{
            System.out.println("total price after discount:"+(total_price-50));
        }

    }
}
public class Zepto {
    public static void main(String[] args) {
        Product p=new Product();
        p.display();
        p.totalPrice();
        p.offer();
    }
}
