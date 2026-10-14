package MultiThreading;

import java.util.ArrayList;

class Movie extends Thread{
    String moviename;
    String language;
    int duration;
    double prices;
    Movie(String moviename,String Language,int duration,double prices){
        this.moviename=moviename;
        this.language=language;
        this.duration=duration;
        this.prices=prices;
    }
    public void run() {
        System.out.println("Movie Details");
        System.out.println("Movie Name: " + moviename);
        System.out.println("Language: " + language);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Price: " + prices);
    }
}
class MovieTickets extends Thread{
    String cname;
    int age;
    MovieTickets(String cname,int age){
        this.cname=cname;
        this.age=age;
    }
    public void run() {
        System.out.println("Customer Details");
        System.out.println("Customer Name: " + cname);
        System.out.println("Age: " + age);
    }
}
class Theatre extends Thread{
    String tname;
    String location;
    String type;
    Theatre(String tname,String location,String type){
        this.tname=tname;
        this.location=location;
        this.type=type;
    }
    public void run() {
        System.out.println("Theatre Details");
        System.out.println("Theatre Name: " + tname);
        System.out.println("Location: " + location);
        System.out.println("Type: " + type);
    }
}
class Snacks extends Thread{
    String sname;
    int quantity;
    double price;

    Snacks(String sname,int quantity,double price){
        this.sname=sname;
        this.quantity=quantity;
        this.price=price;
    }
    public void run() {
        System.out.println("Snacks Details");
        System.out.println("Snack Name: " + sname);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }

}
public class MovieInfo {
    public static void main(String[] args) {
        Movie m = new Movie("Pushpa 2", "Telugu", 200, 250);
        MovieTickets mt = new MovieTickets("Reeshika", 21);
        Theatre t = new Theatre("PVR Cinemas", "Nellore", "Multiplex");
        Snacks s = new Snacks("Popcorn", 2, 300);
        m.start();
        try{
            Thread.sleep(2000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        mt.start();
        try{
            Thread.sleep(2000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        t.start();
        try{
            Thread.sleep(2000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        s.start();
    }
}
