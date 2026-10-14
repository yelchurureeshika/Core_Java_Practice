package Interfaces;
interface notification{
    void message(String message);
}
class SMS implements notification{
    @Override
    public void message(String message) {
        System.out.println("your otp is:"+ message);
    }
}
class Whatsapp implements notification{
    @Override
    public void message(String message) {
        System.out.println("give me the feedback:"+ message);
    }
}
class Gmail implements notification{
    @Override
    public void message(String message) {
        System.out.println("you have done the transacation amount is:"+ message);
    }
}
public class Interface2 {
    public static void main(String[] args) {
        SMS s=new SMS();
        s.message("6543");
        Whatsapp w=new Whatsapp();
        w.message("good");
        Gmail g=new Gmail();
        g.message("2500");


    }
}
