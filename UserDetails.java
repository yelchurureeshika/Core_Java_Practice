import java.util.Scanner;

public class UserDetails {
    public static void main(String[] args) {
        System.out.println("Enter the name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Enter the RollNo:");
        int rollNo=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the branch:");
        String branch=sc.nextLine();
        System.out.println("Enter the collegeName:");
        String collageName=sc.nextLine();
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        System.out.println("Enter the phoneno:");
        Long phoneno=sc.nextLong();
        System.out.println("Enter the cgpa:");
        float cgpa=sc.nextFloat();
        System.out.println("person details:");
        System.out.println("name:"+name);
        System.out.println("rollno:"+rollNo);
        System.out.println("branch:"+branch);
        System.out.println("clg name:"+collageName);
        System.out.println("age:"+age);
        System.out.println("phoneno:"+phoneno);
        System.out.println("cgpa:"+cgpa);
    }
}
