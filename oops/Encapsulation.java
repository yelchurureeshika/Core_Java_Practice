package oops;
class demo2{
    private String pname="apple";
    private int price=100;

    public String getpName(){
        return pname;
    }
    public int getPrice(){
        return price;
    }
    public void setPname(String pname){
        this.pname=pname;
    }
    public void setPrice(int price){
        this.price=price;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        demo2 d=new demo2();
        d.setPname("grapes");
        d.setPrice(200);
        System.out.println(d.getpName());
        System.out.println(d.getPrice());
    }
}
