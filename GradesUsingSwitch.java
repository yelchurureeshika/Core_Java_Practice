import java.util.Scanner;

public class GradesUsingSwitch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks:");
            int n = sc.nextInt();
            switch (n / 10) {
                case 10:
                    System.out.println("S Grade");
                    break;
                case 9:
                    System.out.println("A Grade");
                    break;

                case 8:
                    System.out.println("B Grade");
                    break;

                case 7:
                    System.out.println("C Grade");
                    break;

                case 6:
                    System.out.println("D Grade");
                    break;
                case 5:
                    System.out.println("E Grade");
                    break;
                default:
                    System.out.println("F Grade");
            }
        }
}
