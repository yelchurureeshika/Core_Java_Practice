package Interfaces;
interface  Socialmedia{
    void userCredentials(String username,String password);
}
class gmail implements Socialmedia{
    @Override
    public void userCredentials(String username, String password) {
        System.out.println("username:"+" "+username+" , password:"+" "+ password);
    }
}
class github implements Socialmedia{
    @Override
    public void userCredentials(String username, String password) {
        System.out.println("username:"+" "+username+" , password:"+" "+ password);
    }
}
class linkedin implements Socialmedia{
    @Override
    public void userCredentials(String username, String password) {
        System.out.println("username:"+" "+username+" , password:"+" "+ password);
    }
}

public class Interface3 {
    public static void main(String[] args) {
        gmail g=new gmail();
        g.userCredentials("reeshikayelchuru@gmail.com","reeshika123");
        github git=new github();
        g.userCredentials("reeshika_10","reeshika234");
        linkedin l=new linkedin();
        l.userCredentials("ReeshikaYelchuru","56789");
    }
}
