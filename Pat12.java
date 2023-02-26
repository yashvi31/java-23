import java.util.Scanner;

class Pat12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        int i, j;
        for (i = rows; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}