import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int cube=0,temp=n;
        while(n>0){
            int d=n%10;
            cube=cube+d*d*d;
            n=n/10;
        }
        if(cube==temp){
            System.out.println("Amstrong number");
        }
        else{
            System.out.println("not a Amstrong number");
        }
    }
}
