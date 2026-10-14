public class PrimeNumbers {
    public static void main(String[] args) {
        int n=5;
        boolean flag=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }
    }
}
