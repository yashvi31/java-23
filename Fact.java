import java.util.Scanner;

class Fact {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        String N = sc.nextString();
        while (N > 0) {
            int r = N % 10;
            rev = rev * 10 + r;
            N = N / 10;
        }
        if (temp == rev) {
            System.out.println("it is pallindrom");
        } else {
            System.out.println("not pallindrom");
        }
    }
}