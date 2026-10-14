package oops;
class A{
    void one(){
        System.out.println("parent class");
    }
}
class B extends A{
    void two(){
        System.out.println("child1");
    }
}
class C extends A{
    void three(){
        System.out.println("child2");
    }
}
public class HierarchicalInheritance1 {
    public static void main(String[] args) {
        A a=new A();
        a.one();
        B b=new B();
        b.one();
        b.two();
        C c=new C();
        c.one();
        c.three();

    }
}
