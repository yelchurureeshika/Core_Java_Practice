package constructors;
class Bike{
    String name;
    String proof;
    int days;
    double price;
    double totalcost,result;
    Bike(String name,String proof,int days,double price){
        this.name=name;
        this.proof=proof;
        this.days=days;
        this.price=price;
    }
    void details(){
        System.out.println(name+" "+proof+" "+days+" "+price);
    }
    void totalPrice(){
        totalcost=days*price;
        if(days>=5){
          result=totalcost-(days*(price*0.20));
          System.out.println("final price after discount:"+result);
        }
        else {
            System.out.println(totalcost);
        }

    }

}
public class BikeRental {
    public static void main(String[] args) {
        Bike b1=new Bike("reeshika","license",3,2000);
        Bike b2=new Bike("thanu","Aadhar",5,1000);
        b1.details();
        b1.totalPrice();
        b2.details();
        b2.totalPrice();


    }
}
