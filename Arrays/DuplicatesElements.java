package Arrays;

import java.util.Scanner;

public class DuplicatesElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("no of elements:");
        int n=sc.nextInt();
        int num[]=new int[n];
        int num2[]=new int[n];
        int k=0;
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        for (int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    num2[k]=num[i];
                    k++;
                    break;
                }
            }
        }
        for(int i=0;i<k;i++){
            System.out.println(num2[i]);
        }
    }
}
