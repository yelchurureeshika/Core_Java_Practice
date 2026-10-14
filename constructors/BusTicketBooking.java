package constructors;

import java.util.Scanner;

class Bus{
    String pName;
    String gender;
    String source;
    String destination;
    String date;
    double price;
    double totalprice;

    Bus(String pName,String gender,String source,String destination,String date,double price){
        this.pName=pName;
        this.gender=gender;
        this.source=source;
        this.destination=destination;
        this.date=date;
        this.price=price;
    }
    void details(){
        System.out.println("person details: "+ pName+" "+gender+" "+source+" "+destination+" "+date+" "+price);
    }

    void offer(){
        if(destination.equals("banglore")){
            totalprice=price-(price*0.20);
            System.out.println("total price after discont:"+ totalprice);
        }
        else if(destination.equals("chennai")){
            totalprice=price-(price*0.05);
            System.out.println("total price after discont:"+ totalprice);
        }
        else if(destination.equals("hyderabad")){
            totalprice=price-(price*0.10);
            System.out.println("total price after discont:"+ totalprice);
        }
        else{
            System.out.println("the total price:"+ totalprice);
        }
    }
}
public class BusTicketBooking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bus b1=new Bus("reeshika","female","nellore","banglore","20/10/2026",800);
        Bus b2=new Bus("thanu","female","gudur","chennai","1/10/2026",600);
        b1.details();
        b1.offer();
        b2.details();
        b2.offer();

    }
}
