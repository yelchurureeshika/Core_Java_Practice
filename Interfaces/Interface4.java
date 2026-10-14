package Interfaces;
interface Btech{
    void study();
}
interface CSE extends Btech{
    void programming();
}
class AIStudent implements CSE{
    public void study(){
        System.out.println("students are studying for getting a job");
    }
    public void programming() {
        System.out.println("learning java programming");
    }
}
public class Interface4 {
    public static void main(String[] args) {
        AIStudent ai=new AIStudent();
        ai.study();
        ai.programming();
    }
}
