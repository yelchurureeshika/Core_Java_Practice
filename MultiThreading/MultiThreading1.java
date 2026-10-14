package MultiThreading;
class one extends Thread{
    public void run(){
       for(int i=0;i<=4;i++){
           System.out.println("thread1");
//           try {
//               Thread.sleep(5000);
//           } catch (Exception e) {
//               System.out.println(e);
//           }
       }
    }
}
class two extends Thread{
    public void run(){
        for(int i=0;i<=4;i++){
            System.out.println("thread2");
        }
    }
}
public class MultiThreading1 {
    public static void main(String[] args){
        one t1=new one();
        two t2=new two();
        t1.start();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
    }
}
