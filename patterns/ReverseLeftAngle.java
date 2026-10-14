package patterns;
//Reeshika
import java.util.Scanner;
public class ReverseLeftAngle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for (int i=n; i>=1; i--) {
            for (int j=n; j>i; j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
