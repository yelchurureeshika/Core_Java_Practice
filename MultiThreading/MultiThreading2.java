package MultiThreading;
class Ones implements Runnable{
    public void run(){
        for(int i=0;i<=4;i++){
            System.out.println("thread1");
        }
    }
}
class Twos implements Runnable{
    public void run(){
        for(int i=0;i<=4;i++){
            System.out.println("thread2");
        }
    }
}
public class MultiThreading2 {
    public static void main(String[] args) {
        Ones o=new Ones();
        Thread t=new Thread(o);
        t.start();
        Twos two=new Twos();
        Thread t2=new Thread(two);
        t2.start();
    }
}
