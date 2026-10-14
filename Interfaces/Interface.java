package Interfaces;

interface Animal{
    public void demo();
    static void demo1(){
        System.out.println("static method of java 8");
    }
    default void demo2(){
        System.out.println("default method of java 8");
    }
}
interface dog{
    public void sound();
}
class Cat implements Animal,dog{
   public void demo(){
        System.out.println("abstract method");
    }
    public void sound(){
       System.out.println("dog is barking");
    }
}
public class Interface {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.demo();
        c.sound();
        Animal a=new Cat();
        a.demo2();
        Animal.demo1();


    }
}
