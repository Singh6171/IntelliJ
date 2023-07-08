package loops;

import java.util.Scanner;

public class SwitchCaseCalculator {
    public static void main(String[] args) {

        System.out.println("Calculator Application");
        System.out.println("Enter value from below");
        System.out.println("1 For Addition");
        System.out.println("2 For Subtraction");
        System.out.println("3 For Multiplication");
        System.out.println("4 For Division");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int a;
        a = sc.nextInt();

        int num1;
        System.out.println("enter 1st value");
        num1 = sc.nextInt();

        int num2;
        System.out.println("enter 2nd value");
        num2 = sc.nextInt();




        switch (a){
            case 1:
                System.out.println("Addition");
                System.out.print("Addition of the two values is " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction");
                System.out.print("Subtraction of the two values is " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication");
                System.out.print("Multiplication of the two values is " + (num1 * num2));
                break;
            case 4:
                System.out.println("Division");
                System.out.print("Division of the two values is " + (num1 / num2));
                break;
            default:
                System.err.println("Wrong input");
        }
    }
}
