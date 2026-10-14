package oops;
//Reeshika
class Employee{
    String Emp_name="reeshika";
    int Emp_id=1013;
    double Emp_salary=300000;
}
class Department{
    int Dept_id=5002;
    String Dept_name="HR";
}
public class ClassAndObject2 {
    public static void main(String[] args) {
        Employee e=new Employee();
        System.out.println(e.Emp_name+" "+e.Emp_id+" "+e.Emp_salary);
        Department d=new Department();
        System.out.println(d.Dept_id+" "+d.Dept_name);
    }
}
