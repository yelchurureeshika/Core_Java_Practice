package oops;
class Demo{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

}
public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.add(5,6);
        d.add(6,7,8);
    }
}
