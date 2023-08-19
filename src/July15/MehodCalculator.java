package July15;

import java.util.Scanner;

public class MehodCalculator {
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
        int num;
        int x;
        int y;
        int z;
        int q;


        if (a == '+') {
            System.out.println("How many Numbers do you want to add (1-4)");
            num = sc.nextInt();
            if (num == 2) {

              System.out.println("Input 1st Number");
                x= sc.nextInt();
                System.out.println("Input 2nd Number");
                y= sc.nextInt();

                System.out.print("Addition of the two values is " + Numbers.sum(x, y));
            } else if (num == 3) {

                System.out.println("Input 1st Number");
                x = sc.nextInt();
                System.out.println("Input 2nd Number");
                y = sc.nextInt();
                System.out.println("Input 3rd Number");
                z = sc.nextInt();

                System.out.print("Addition of the two values is " + Numbers.sum(x, y, z));
            } else if (num == 4) {

                x= sc.nextInt();
                System.out.println("Input 2nd Number");
                y= sc.nextInt();
                System.out.println("Input 3rd Number");
                z= sc.nextInt();
                System.out.println("Input 4th Number");
                q= sc.nextInt();
                System.out.print("Addition of the two values is " + Numbers.sum(x, y, z, q));
            }
        }
        else if (a == '-') {
            System.out.println("Input 1st Number");
            x= sc.nextInt();
            System.out.println("Input 2nd Number");
            y= sc.nextInt();
            System.out.print("Subtraction of the two values is " + Numbers.subtract(x, y));
        }
        else if (a == '*') {
            System.out.println("How many Numbers do you want to add (1-4)");
            num = sc.nextInt();
            if (num == 2) {
                System.out.println("Input 1st Number");
                x= sc.nextInt();
                System.out.println("Input 2nd Number");
                y= sc.nextInt();

                System.out.print("Multiplication of the two values is " + Numbers.multiply(x, y));
            } else if (num == 3) {
                System.out.println("Input 1st Number");
                x = sc.nextInt();
                System.out.println("Input 2nd Number");
                y = sc.nextInt();
                System.out.println("Input 3rd Number");
                z = sc.nextInt();

                System.out.print("Addition of the two values is " + Numbers.sum(x, y, z));
            } else if (num == 4) {
                x= sc.nextInt();
                System.out.println("Input 2nd Number");
                y= sc.nextInt();
                System.out.println("Input 3rd Number");
                z= sc.nextInt();
                System.out.println("Input 4th Number");
                q= sc.nextInt();

                System.out.print("Addition of the two values is " + Numbers.sum(x, y, z, q));
            }
        else if (a == '/') {
                System.out.println("Input 1st Number");
                x= sc.nextInt();
                System.out.println("Input 2nd Number");
                y= sc.nextInt();
                System.out.print("Division /of the two values is " + Numbers.divide(x, y));
        } else {
                System.out.println("Wrong Input");

            }
        }


    }
  }

