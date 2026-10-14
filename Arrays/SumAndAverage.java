package Arrays;

import java.util.Scanner;

public class SumAndAverage {

    public static int findSum(int num[]){
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        return sum;
    }

    public static int findAverage(int sum,int n){
        int average=sum/n;
        return average;
    }
    public static void main(String[] args) {
//        int[] num={2,3,4,5};
//        int sum=0;
//        for(int i=0;i<num.length;i++){
//            sum=sum+num[i];
//        }
//        System.out.println("sum is:"+ sum);
//        System.out.println("Average is:"+ sum/num.length);

        Scanner sc=new Scanner(System.in);
        System.out.println("no of elements:");
        int n=sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        int totalsum=findSum(num);
        int avg=findAverage(totalsum,n);
        System.out.println("total sum is:"+ totalsum);
        System.out.println("total average is:"+ avg);
    }
}
