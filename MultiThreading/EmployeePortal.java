package MultiThreading;
class Employee extends Thread{
    String name;
    String qualification;
    int passedoutyear;
    double cgpa;
    Employee(String name,String qualification,int passedoutyear,double cgpa){
        this.name=name;
        this.qualification=qualification;
        this.passedoutyear=passedoutyear;
        this.cgpa=cgpa;
    }
    public void run() {
        System.out.println("Employee Details");
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Passed Out Year: " + passedoutyear);
        System.out.println("CGPA: " + cgpa);
    }
}
class Application extends Thread{
    String role;
    String resume;
    String address;
    long ctc;

    Application(String role,String resume,String  address,long ctc){
        this.role=role;
        this.resume=resume;
        this.address=address;
        this.ctc=ctc;
    }
    public void run() {
        System.out.println("Application Details");
        System.out.println("Role: " + role);
        System.out.println("Resume: " + resume);
        System.out.println("Address: " + address);
        System.out.println("CTC: " + ctc);
    }
}
class Company extends  Thread{
    String cname;
    String jobtype;
    int bond;

    Company(String cname,String  jobtype,int bond){
        this.cname=cname;
        this.jobtype=jobtype;
        this.bond=bond;
    }
    public void run() {
        System.out.println("Company Details");
        System.out.println("Company Name: " + cname);
        System.out.println("Job Type: " + jobtype);
        System.out.println("Bond: " + bond);
    }
}
public class EmployeePortal {
    public static void main(String[] args) {
        Employee e=new Employee("Reeshika","BTech",2026,8.9);
        Application a=new Application("Java Developer","reeshikaresume.pdf","bangalore",400000);
        Company c=new Company("TCS","Full Time",2);
        e.start();
        try{
            Thread.sleep(2000);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        a.start();
        try{
            Thread.sleep(2000);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        c.start();
    }
}
