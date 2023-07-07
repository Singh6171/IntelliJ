package loops;

import java.util.Scanner;

public class ifElseLoops {

    public static void main(String[] args) {
        int x = 12;
        int y = 14;
        int z = 16;

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
