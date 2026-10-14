package NestedClasses;
class Outer1{
    void demo1(){
         class inner{
            void demo(){
                System.out.println("inner class data");
            }
        }
        inner i=new inner();
        i.demo();
    }
}
public class MethodLocalInnerClass {
    public static void main(String[] args) {
        Outer1 o=new Outer1();
        o.demo1();
    }
}
