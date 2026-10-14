package methods;

class java{
    public void greet(){ //method declaration
        System.out.println("Hello Developer");
    }
    public void add(int a,int b){  //without return type
        System.out.println(a+b);
    }
    public int sub(int a,int b){  //with return type
        return a-b;
    }
}

public class UserDefined {
    public static void main(String[] args) {
        java j=new java();
        j.greet();
        j.add(3,4);//method call
        System.out.println(j.sub(9,4));
    }
}
