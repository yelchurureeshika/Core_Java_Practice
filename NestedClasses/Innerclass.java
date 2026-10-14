package NestedClasses;
class Outer{
    private class Inner{
        void demo(){
            System.out.println("inner class data");
        }
    }
    void demo1(){
        Inner i=new Inner();
        i.demo();
    }
}
public class Innerclass {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.demo1();
    }
}
