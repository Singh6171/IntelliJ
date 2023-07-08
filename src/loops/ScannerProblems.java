package loops;

import java.util.Scanner;

public class ScannerProblems {

        public static void main(String[] args) {
            int x ;
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter a value for x");
            x = scanner.nextInt();
            int y ;
            System.out.println("enter a value for y");
            y = scanner.nextInt();
            int z ;
            System.out.println("enter a value for z");
            z = scanner.nextInt();

            if ((x > y) && (x > z)) {
                System.out.println("x is greatest number");
            } else if ((y > z) && (y > z)) {
                System.out.println("y is greatest number");
            } else if ((z > x) && (z > y)) {
                System.out.println("z is greatest number");
            } else {
                System.out.println("All are equal");
            }
        }
    }

