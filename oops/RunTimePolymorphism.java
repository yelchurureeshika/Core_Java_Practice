package oops;
class parent{
    void mobile(String name){
        System.out.println("parent mobile:"+name);
    }
}
class Child extends parent{
    void mobile(String name,String ram,String rom){
        System.out.println("child mobile:"+name+" "+ram+" "+rom);
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Child c=new Child();
        c.mobile("oppo");
        c.mobile("vivo","4gb","64gb");
    }

}
