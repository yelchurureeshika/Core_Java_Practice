package Arrays;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
//        int[] num={1,2,3,4};
////      System.out.println(num[0]);
//        for(int i=0;i<num.length;i++){
//            System.out.println(num[i]);
//        }

        Scanner sc=new Scanner(System.in);
        System.out.println("no of elements:");
        int n=sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<num.length;i++){
            System.out.println("the elements are:"+num[i]);
        }
    }
}
