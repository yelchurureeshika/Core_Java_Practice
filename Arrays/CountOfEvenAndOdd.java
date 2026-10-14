package Arrays;

import java.util.Scanner;

public class CountOfEvenAndOdd {
    public static int findEven(int num[]){
        int even=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                even++;
            }
        }
        return even;
    }
    public static int findOdd(int num[]){
        int odd=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2!=0){
                odd++;
            }
        }
        return odd;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("no of elements:");
        int n=sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        int evencount=findEven(num);
        int oddcount=findOdd(num);
        System.out.println("even count:"+ evencount);
        System.out.println("odd count:"+oddcount);
    }
}
