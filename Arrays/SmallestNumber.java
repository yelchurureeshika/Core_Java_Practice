package Arrays;
//Reeshika
import java.util.Scanner;
public class SmallestNumber {
    public static int Smallest(int num[]){
        int min=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("no of elements:");
        int n=sc.nextInt();
        int num[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        int min=Smallest(num);
        System.out.println("smallest element:"+ min);
    }
}
