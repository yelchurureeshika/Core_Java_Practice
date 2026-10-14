package Arrays;

import java.util.Scanner;
//Reeshika
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n=sc.nextInt();
        int num[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        for(int i=num.length-1;i>=0;i--){
            System.out.print(num[i]+" ");
        }
    }
}
