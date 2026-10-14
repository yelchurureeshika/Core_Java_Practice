import java.util.Scanner;

public class CountDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int count=0;
        while(Math.abs(n)>0){
            n=n/10;
            count++;
        }
        System.out.println("count is:"+ count);

    }
}
