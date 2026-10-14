package patterns;

public class ReverseRightAngle {
    public static void main(String[] args) {
        int num=1;
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
//                System.out.print("* ");
//                System.out.print(i+" ");
//                System.out.print("* ");
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
