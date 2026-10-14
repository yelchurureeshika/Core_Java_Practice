package oops;
class Person{
    String name="reeshika";
    int age=21;
}
class Dog{
    String name="sizzu";
    String color="white";
}

public class ClassAndObject {
    public static void main(String[] args) {
        //one class multiple objects
        Person p1=new Person();
        Person p2=new Person();
        System.out.println(p1.name);
        System.out.println(p2.age);

        //one file multiple classes
        Dog d=new Dog();
        System.out.println(d.name);
        System.out.println(d.color);

    }
}
