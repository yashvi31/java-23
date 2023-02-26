
//Vaccine registration 1
import java.util.Scanner;

class Switch2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Login as user or admin ?");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("sign in as admin");
        } else if (a == 2) {
            System.out.println("sign in as User");
        } else {
            System.out.println("enter valid number");
        }
    }
}