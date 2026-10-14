package oops;
class car{
    String colour;
    double price;
    car(String colour,double price){
        this.colour=colour;
        this.price=price;
    }
    void cdetails(){
        System.out.println("car details:"+colour+" "+price);
    }
}
class Bmw extends car{
    Bmw(String colour,double price){
        super(colour,price);
    }
    void bmwDetails(){
        System.out.println("bmw details:"+colour+" "+price);
    }
}
class Audi extends car{
    Audi(String colour,double price){
        super(colour,price);
    }
    void audiDetails(){
        System.out.println("audi details:"+colour+" "+price);
    }
}
public class HierarchicalInheritance3 {
    public static void main(String[] args) {
        Bmw b=new Bmw("black",4000000000.26);
        Audi a=new Audi("white",67893200.09);
        b.bmwDetails();
        a.audiDetails();
        b.cdetails();
    }
}
