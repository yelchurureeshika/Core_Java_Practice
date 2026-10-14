package oops;
class coffee{
    void coffee(int milk, int water, int sugar, int coffeePowder) {
        System.out.println("Coffee with sugar is prepared");
    }

    void coffee(int milk, int water, int coffeePowder) {
        System.out.println("Coffee without sugar is prepared");
    }

    void coffee(int water, int coffeePowder) {
        System.out.println("Black coffee is prepared");
    }
}
public class OverLoading2 {
    public static void main(String[] args) {
        coffee c=new coffee();
        c.coffee(1,200,1,1);
        c.coffee(1,200,1);
        c.coffee(1,1);
    }
}
