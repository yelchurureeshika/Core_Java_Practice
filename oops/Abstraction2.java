package oops;
abstract class doctor{
    String name;
    int age;
    doctor(String name,int age){
        this.name=name;
        this.age=age;
    }
    abstract void card1();
    abstract void neo1(String n1,int a1);

}
class cardiologist extends doctor{
    cardiologist(String name,int age){
        super(name,age);
    }
   void card1(){
       System.out.println("cardiologist details:"+ name+" "+age);
   }
    void neo1(String n1,int a1){
        System.out.println("neurologist details:"+ n1+" "+a1);
    }

}
public class Abstraction2 {
    public static void main(String[] args) {
        cardiologist c=new cardiologist("DR.Ajay",50);
        c.card1();
        c.neo1("Dr.raj",70);


    }
}
