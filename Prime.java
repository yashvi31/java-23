import java.util.Scanner;

class Prime {
    public static void main(String args[]) {
        int i, factor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++)
            if (n % i == 0) {
                factor++;
            }
        if (factor == 2) {
            System.out.println(n + "is prime number");
        } else {
            System.out.println("not prime");
        }
    }
}