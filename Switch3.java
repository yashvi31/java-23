
//Vaccine reistration 3
import java.util.Scanner;


class Switch3 {
    public static void main(String args[]) {
        Child c1 = new Child();
        c1.Display1();
        c1.Display();
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