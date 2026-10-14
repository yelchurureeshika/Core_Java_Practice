package MultiThreading;
class Customer extends Thread{
    String cName;
    String cAddress;

    Customer(String cName,String cAddress){
        this.cName=cName;
        this.cAddress=cAddress;
    }

    public void run(){
        System.out.println(cName +" your order is confirmed!");
        System.out.println("Customer Details:");
        System.out.println("Name: " + cName);
        System.out.println("Address: "+ cAddress);
    }
}
class Order extends Thread{
    String orderId;
    String item;
    double price;

    Order(String orderId,String item,double price){
        this.orderId=orderId;
        this.item=item;
        this.price=price;
    }

    public void run(){
        System.out.println("your order ID is:" + orderId+" order is preparing!");
        System.out.println("order details:");
        System.out.println("Item is:"+ item);
        System.out.println("price is:"+ price);
    }

}
class DeliveryPartner extends Thread{
    String dpName;
    String mobileNo;
    DeliveryPartner(String dpName,String mobileNo){
        this.dpName=dpName;
        this.mobileNo=mobileNo;
    }
    public void run(){
        System.out.println("Delivery Partner is Assigned order is arriving shortly");
        System.out.println("delivery partner Details:");
        System.out.println("Name is:"+ dpName);
        System.out.println("MobileNo is:"+ mobileNo);
    }
}

public class Swiggy {
    public static void main(String[] args) {
        Customer c=new Customer("reeshika","bangalore");
        c.start();
        try{
            Thread.sleep(2000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Order o=new Order("pi123","icecream",200);
        o.start();
        DeliveryPartner d=new DeliveryPartner("hghg","2345689908");
        try{
            Thread.sleep(5000);
            d.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try{
            Thread.sleep(6000);
            System.out.println("order delivered successfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
