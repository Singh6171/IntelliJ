package July15;

import java.util.Scanner;

public class Numbers {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sum(int x, int y, int z) {
        return x + y + z;
    }
    public static int sum(int x, int y, int z, int q) {
        return x + y + z + q;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int multiply(int x, int y, int z) {
        return x * y * z;
    }
    public static int multiply(int x, int y, int z, int q) {
        return x * y * z * q;
    }
    public static int divide(int x, int y) {
        return x % y;
    }

    //gives two input
    public static int getNumber(int x, int y){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1st Number");
        x= sc.nextInt();
        System.out.println("Input 2nd Number");
        y= sc.nextInt();
        return x;
    }

    //gives three input
    public static void getNumber(int x, int y, int z) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1st Number");
        x = sc.nextInt();
        System.out.println("Input 2nd Number");
        y = sc.nextInt();
        System.out.println("Input 3rd Number");
        z = sc.nextInt();
    }
    //gives four input
    public static void getNumber(int x, int y, int z, int q){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1st Number");
        x= sc.nextInt();
        System.out.println("Input 2nd Number");
        y= sc.nextInt();
        System.out.println("Input 3rd Number");
        z= sc.nextInt();
        System.out.println("Input 4th Number");
        q= sc.nextInt();

    }





}