package methods;

import java.util.Scanner;

public class InBuilt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.abs(-a));
        System.out.println(Math.pow(a,b));
        System.out.println(Math.ceil(b));
        System.out.println(Math.round(b));
        System.out.println(Math.floor(b));





    }
}
