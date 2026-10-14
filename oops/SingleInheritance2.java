package oops;
class Vechicle{
    String fuel_type;
    int noofseat;
    Vechicle(String fuel_type,int noofseat){
        this.fuel_type=fuel_type;
        this.noofseat=noofseat;
    }
    void vdetails(){
        System.out.println("vechicle details:"+fuel_type+" "+noofseat);
    }
}
class Car extends Vechicle{
    String model_name;
    String color;
    double price;

    Car(String fuel_type,int noofseat,String model_name,String color,double price){
        super(fuel_type,noofseat);
        this.model_name=model_name;
        this.color=color;
        this.price=price;
    }
    void cdetails(){
        System.out.println("car details:"+fuel_type+" "+noofseat+" "+model_name+" "+color+" "+price);

    }


}
public class SingleInheritance2 {
    public static void main(String[] args) {
//        Vechicle v=new Vechicle("petrol",5);
//        v.vdetails();
        Car c=new Car("disel",7,"creta","black",12345678);
        c.vdetails();
        c.cdetails();

    }
}
