import java.util.Scanner;

public class NestedIfElseUsingString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the role");
        String role=sc.nextLine();
        System.out.println("Enter the username");
        String username=sc.nextLine();
        System.out.println("Enter the password");
        String password=sc.nextLine();
        if(role.equals("admin")){
            if(username.equals("reeshika")){
                if(password.equals("1234")){
                    System.out.println("u can access entire data");
                }
                else{
                    System.out.println("u are Restricted to access data");
                }
            }
            else{
                System.out.println("u are Restricted to access data");
            }
        }
        else if(role.equals("developer")){
            System.out.println("u work is to develop applications");
        }
        else{
            System.out.println("please enter correct role!");
        }
    }
}
