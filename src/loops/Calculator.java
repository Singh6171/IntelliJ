package loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        System.out.println("Calculator Application");
        System.out.println("Enter value from below");
        System.out.println("+ For Addition");
        System.out.println("- For Subtraction");
        System.out.println("* For Multiplication");
        System.out.println("/ For Division");




        char a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        a = sc.next().charAt(0);

        if (a == '+') {
            System.out.println("Addition");
            int x;
            System.out.println("enter 1st value");
            x = sc.nextInt();
            int y;
            System.out.println("enter 2nd value");
            y = sc.nextInt();
            System.out.print("Addition of the two values is " + (x+y));

        } else if (a == '-') {
            System.out.println("Subtraction");
            int x;
            System.out.println("enter 1st value");
            x = sc.nextInt();
            int y;
            System.out.println("enter 2nd value");
            y = sc.nextInt();
            System.out.print("Subtraction of the two values is " + (x-y));

        } else if (a == '*') {
            System.out.println("Multiplication");
            int x;
            System.out.println("enter 1st value");
            x = sc.nextInt();
            int y;
            System.out.println("enter 2nd value");
            y = sc.nextInt();
            System.out.print("Multiplication of the two values is " + (x*y));

        } else if (a == '/') {
            System.out.println("Division");
            int x;
            System.out.println("enter 1st value");
            x = sc.nextInt();
            int y;
            System.out.println("enter 2nd value");
            y = sc.nextInt();
            System.out.print("Division of the two values is " + (x/y));


        } else {
            System.out.println("Wrong Input");

        }
    }
}
