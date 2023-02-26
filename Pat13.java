import java.util.Scanner;

class Pat13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        int i, j, temp = 1, k, l;
        for (i = 1; i <= rows; i++) {
            for (j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(temp + " ");
                temp++;
            }
            int temp1 = temp - 1;
            for (l = 2; l <= i; l++) {
                System.out.print(temp1 + " ");
            }
            System.out.println();
        }
    }
}

/*
1 
2 3 3 
4 5 6 6 6 
7 8 9 10 10 10 10 
11 12 13 14 15 15 15 15 15 
*/