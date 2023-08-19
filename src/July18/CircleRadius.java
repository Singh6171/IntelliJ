package July18;

import java.util.Scanner;

public class CircleRadius {
    static double pi = 3.14;
    double radius;

    public double areaOfCircle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Radius");
        radius = sc.nextInt();

        double area = radius * radius * pi;

        return area;
    }

    public static void main(String[] args) {
        CircleRadius ca = new CircleRadius();
        System.out.println("area is : " + ca.areaOfCircle());
    }
}