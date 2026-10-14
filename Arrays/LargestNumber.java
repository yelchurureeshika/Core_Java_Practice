package Arrays;

import java.util.Scanner;
public class LargestNumber {
    public static int Largest(int num[]){
        int max=0;
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("no of elements:");
        int n=sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        int max=Largest(num);
        System.out.println("largest element:"+ max);
    }
}
