package loops;

import java.util.Scanner;

public class AddressFinder {
    public static void main(String[] args) {

        System.out.println("Address Finder");
        System.out.println("Enter name from below to get the address");
        System.out.println("Pragra");
        System.out.println("CN Tower");
        System.out.println("Scotia Arena");
        System.out.println("Aquarium");


        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        a = sc.next();

        switch (a) {
            case "Pragra":
                System.out.print("The Address is : 202-200 Matheson Blvd W, Mississauga, ON, L5R 3L7, Canada");
                break;
            case "CN Tower":
                System.out.print("The Address is : 290 Bremner Blvd, Toronto, ON, M5V 3L9, Canada");
                break;
            case "Scotia Arena":
                System.out.print("The Address is 40 Bay St, Toronto, ON, M5J 2X2, Canada");
                break;
            case "Aquarium":
                System.out.print("The Address is 288 Bremner Blvd, Toronto, ON, M5V 3L9, Canada");
                break;

            default:
                System.err.println("Wrong input");
        }
    }
}