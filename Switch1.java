
//Vaccine registration 2
import java.util.Scanner;

class Switch1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Hospital in ahmedabad");
                break;
            case 2:
                System.out.println("Hospital in surat");
                break;
            case 3:
                System.out.println("Hospital in rajkot");
                break;
            case 4:
                System.out.println("Hospital in surendranagar");
                break;
            case 5:
                System.out.println("Hospital in anand");
                break;
            default:
                System.out.println("enter valid number");
        }
    }
}