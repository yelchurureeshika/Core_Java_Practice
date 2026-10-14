import java.util.Scanner;

public class PostiveOrNegativeEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(n>=0){
            if(n%2==0){
                System.out.println(n+" is Positive Even Number");
            }
            else{
                System.out.println(n+" is Positive Odd Number");
            }
        }
        else{
            if(n%2==0){
                System.out.println(n+" is Negative Even Number");
            }
            else{
                System.out.println(n+" is Negative Odd Number");
            }

        }

    }
}
