package oops;

class Animal{
    String type;
    String name;
    Animal(String type,String name){
        this.type=type;
        this.name=name;

    }
    void aDetails(){
        System.out.println("Animal Details are:"+type+" "+name);
    }
}
class cat extends Animal{
    String breed;
    cat(String type,String name,String breed){
        super(type,name);
        this.breed=breed;
    }
    void dDetails(){
        System.out.println("Cat Details are:"+type+" "+name+" "+breed);
    }
}
class babycat extends cat{
    String colour;

    babycat(String type,String name,String breed,String colour){
        super(type,name,breed);
        this.colour=colour;
    }

    void bdDetails(){
        System.out.println("Cat Details are:"+type+" "+name+" "+breed+" "+colour);
    }

}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        babycat b1=new babycat("cat","pluto","persian","white");
        b1.aDetails();
        b1.dDetails();
        b1.bdDetails();
    }
}
