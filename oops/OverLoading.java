package oops;
abstract class company{
    String name;
    String role;
    int noofyears;
    double bonus;
    company(String name,String role,int noofyears, double bonus) {
        this.name=name;
        this.role=role;
        this.noofyears = noofyears;
        this.bonus = bonus;
    }
    void details(){
        System.out.println("employee details:"+name+" "+role+" "+noofyears+" "+bonus);
    }
    abstract void calculatebonus();
}
class employees extends company{
    employees(String name,String role,int noofyears,double bonus){
        super(name,role,noofyears,bonus);
    }
        void calculatebonus(){
            if(noofyears>3){
                System.out.println("bonus: "+(bonus+1000));
            }
            else{
                System.out.println("zero bonus");
            }
        }
}
public class OverLoading {
    public static void main(String[] args) {
        employees e=new employees("reeshika","admin",4,10000);
        e.details();
        e.calculatebonus();
    }
}
