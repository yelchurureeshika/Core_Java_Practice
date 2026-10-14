package ExceptionHandling;

public class UncheckedException {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int a=8;
        int b=0;
        try{
            int c=a/b;
            System.out.println(c);
            System.out.println(arr[6]);
        } catch (Exception e) {
            System.out.println("denominator should not be zero "+ e);
        }
        finally {
            System.out.println("developers");
        }
    }
}
