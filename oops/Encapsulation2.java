package oops;
import java.util.Scanner;
class Employees{
    private String name;
    private String role;
    private double salary;
    private String id;

    public String getName(){

        return name;
    }
    public String getRole(){

        return role;
    }
    public double getSalary(){

        return salary;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){

        this.name=name;
    }
    public void setRole(String role){

        this.role=role;
    }
    public void setSalary(double salary){

        this.salary=salary;
    }
    public void setId(String id){
        this.id=id;
    }
}
public class Encapsulation2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employees e=new Employees();
        System.out.println("Enter employee name: ");
        e.setName(sc.nextLine());
        System.out.println("Enter employee role: ");
        e.setRole(sc.nextLine());
        System.out.println("Enter employee salary: ");
        e.setSalary(sc.nextDouble());
        sc.nextLine();
        System.out.println("Enter employee ID: ");
        e.setId(sc.nextLine());
        System.out.println("Employee Details:");
        System.out.println("Name: " + e.getName());
        System.out.println("Role: " + e.getRole());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("ID: " + e.getId());
    }
}
