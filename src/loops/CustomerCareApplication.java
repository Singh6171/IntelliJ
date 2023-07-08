package loops;

import java.util.Scanner;

public class CustomerCareApplication {
    public static void main(String[] args) {

        System.out.println("Customer Care Application");
        System.out.println("Enter value from below");
        System.out.println("1 For HR");
        System.out.println("2 For Accounting");
        System.out.println("3 For Dispatch");
        System.out.println("4 For Repair");


        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        a = sc.nextInt();

        switch (a){
            case 1:
                System.out.print("Forwarding to HR");
                break;
            case 2:
                System.out.print("Forwarding to Accounting");
                break;
            case 3:
                System.out.print("Forwarding to Dispatch");
                break;
            case 4:
                System.out.print("Forwarding to Repair");
                break;

            default:
                System.err.println("Wrong input");
        }
    }

}
