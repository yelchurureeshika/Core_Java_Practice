package oops;
class Parent{
    void p1(){
        System.out.println("parent class");
    }
}
class child extends Parent{
        void p2(){
            System.out.println("child class");
        }
}

public class SingleInheritance {
    public static void main(String[] args) {
        child c=new child();
        c.p1();
        c.p2();

    }
}
