import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        //assignment operator
        System.out.println(a=b);
        System.out.println(a+=b);
        System.out.println(a-=b);
        System.out.println(a*=b);
        System.out.println(a/=b);
        System.out.println(a%=b);
        System.out.println(a&=b);
        System.out.println(a|=b);
        System.out.println(a^=b);
        System.out.println(a>>=b);
        System.out.println(a<<=b);
        //arithmetic
        System.out.println("addition is: "+(a+b));
        System.out.println("subtraction is: "+(a-b));
        System.out.println("multiplication is: "+(a*b));
        System.out.println("modulus is: "+(a%b));
        System.out.println("division is: "+(a/b));
        //Relational
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        //logical operator
        System.out.println(a>b&&a!=b);
        System.out.println(a>b||b==a);
        System.out.println(!(a>b));

        //bitwise
        System.out.println("bitwise and is "+(a&b));
        System.out.println("bitwise or is "+(a|b));
        System.out.println("bitwise not is "+(a^b));
        System.out.println("bitwise compliment is "+(~a));
        System.out.println("bitwise leftshift is "+(a<<2));
        System.out.println("bitwise rightshift is "+(a>>2));
    }
}
