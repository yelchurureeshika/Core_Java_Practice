package oops;

class Payment{
    String IFSC_code;
    String bankName;

    Payment(String IFSC_code,String bankName){
        this.IFSC_code=IFSC_code;
        this.bankName=bankName;
    }
    void payDetails(){
        System.out.println("payment details:"+IFSC_code+" "+bankName);
    }
}
class Upi extends Payment{
    String upiId;
    String appName;
    Upi(String IFSC_code,String bankName,String upiId,String appName){
        super(IFSC_code,bankName);
        this.upiId=upiId;
        this.appName=appName;
    }
    void upiDetails(){
        System.out.println("upi details:"+IFSC_code+" "+bankName+" "+upiId+" "+appName);
    }
}
class Card extends Payment{
    String cardNo;
    String transactionId;
    Card(String IFSC_code,String bankName,String cardNo,String transactionId){
        super(IFSC_code,bankName);
        this.cardNo=cardNo;
        this.transactionId=transactionId;
    }
    void cardDetails(){
        System.out.println("card details:"+IFSC_code+" "+bankName+" "+cardNo+" "+transactionId);
    }
}
public class HierarchicalInheritance2 {
    public static void main(String[] args) {
        Card c=new Card("SBI234500","SBI","234890543","AR2345Tr1234");
        Upi u=new Upi("SBI234500","SBI","RET3246789GFE456","Phonepe");
        u.upiDetails();
        c.cardDetails();
        u.payDetails();
        c.payDetails();
    }
}
