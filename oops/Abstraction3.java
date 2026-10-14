package oops;
abstract class vechicles{
    abstract void start();
}
class cars extends vechicles{
    void start() {
        System.out.println("car engine is starting");
    }
}

class MotorCycle extends vechicles{
    void start() {
        System.out.println("MotorCycle engine  is starting");
    }
}
public class Abstraction3 {
    public static void main(String[] args) {
        cars c=new cars();
        c.start();
        MotorCycle m=new MotorCycle();
        m.start();
    }
}
