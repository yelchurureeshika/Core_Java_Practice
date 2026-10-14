package constructors;
class car{
    String name;
    String color;
    String RegNo;

    car(String name,String color,String RegNo){
        this.name=name;
        this.color=color;
        this.RegNo=RegNo;
    }
    void carDetais(){
        System.out.println(name+" "+color+" "+RegNo);
    }
}
public class Constructor {
    public static void main(String[] args) {
        car c1=new car("nexon","white","AP26MA2345");
        car c2=new car("kia","black","AP26DK1645");
        c1.carDetais();
        c2.carDetais();

    }
}
