package Arrays;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("no of elements:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int num1[][]=new int[r][c];
        int num2[][]=new int[r][c];
        int num3[][]=new int[r][c];
        System.out.println("Enter 1st matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                num1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter 2nd matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                num2[i][j]=sc.nextInt();
            }
        }
        System.out.println("addition of matrix is:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                num3[i][j]=num1[i][j]+num2[i][j];
                System.out.print(num3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
