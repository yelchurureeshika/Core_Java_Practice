package methods;

import java.util.Scanner;

class Atm{
    double balance=3000;
    void showBalance(){
        System.out.println("Balance is:"+balance);
    }
    void deposit(double deposit_amount){
        System.out.println("the amount "+ deposit_amount +" deposited successfully");
        balance=balance+deposit_amount;
        System.out.println("the total balance is:"+balance);
    }
    void withdraw(double withdraw_amount){
        if(withdraw_amount>balance){
            System.out.println("Insufficient balance");
            System.out.println("The total balance is:"+balance);

        }
        else{
            balance=balance-withdraw_amount;
            System.out.println("the amount "+ withdraw_amount +" withdraw successfully");
            System.out.println("The total balance is:"+balance);
        }
    }
}
public class Banking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Atm a=new Atm();
        a.showBalance();
        System.out.println("Enter deposit amount:");
        a.deposit(sc.nextDouble());
        System.out.println("Enter withdraw amount: ");
        a.withdraw(sc.nextDouble());


    }
}
