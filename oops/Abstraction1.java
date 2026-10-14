package oops;
abstract class demo{
    abstract void find();
    abstract void java();
    void greet(){
        System.out.println("normal method");
    }
}
class demo1 extends demo{
    void find(){
        System.out.println("abstract method");
    }
    void java(){
        System.out.println("abstract method");
    }

}
public class Abstraction1 {
    public static void main(String[] args) {
        demo1 d=new demo1();
        d.find();
        d.java();
        d.greet();
    }
}
