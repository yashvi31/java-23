import java.util.Scanner;

class Final {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Login as user or admin ?");
        System.out.println("if sign in as admin enter 1 , if sign in as user enter 2");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("sign in as admin");
        } else if (a == 2) {
            System.out.println("sign in as User");
        } else {
            System.out.println("enter valid number");
        }
        Child c1 = new Child();
        c1.Display1();
        c1.Display();
        System.out.println("Chhose Hospital in ahmedabad");
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

class Parent {
    int name, age;
    long Phone_number;
    String email;
    String city, State;

    void Display() {
        System.out.println("Welcome");
    }
}

class Child extends Parent {
    int name, age;
    long Phone_number;
    String email;
    String city, State;

    void Display1() {
        System.out.println("WELCOME TO VACCINE REGISTRATION SYSTEM");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        System.out.print("Please enter your phone number: ");
        long phoneNumber = sc.nextLong();
        System.out.print("Please enter your email address: ");
        String email = sc.next();
        System.out.print("Please enter your city: ");
        String city = sc.next();
        System.out.print("Please enter your state: ");
        String state = sc.next();
    }
}