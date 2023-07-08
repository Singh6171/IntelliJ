package loops;

import java.util.Scanner;

public class CustomerCareApplication {
    public static void main(String[] args) {

        System.out.println("Customer Care Application");
        System.out.println("Enter value from below");
        System.out.println("1 For English");
        System.out.println("2 For French");

        int language;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        language = sc.nextInt();

        switch (language){
            case 1:
                System.out.print("Forwarding to English Menu");
                System.out.println("Enter value from below");
                System.out.println("1 For Home Internet");
                System.out.println("2 For Wireless");
                System.out.println("3 For Accounts");
                System.out.println("4 For Billing");

                int departments;
                System.out.println("enter a value");
                departments = sc.nextInt();

                switch(departments){
                    case 1:
                        System.out.println("Welcome to Home Internet Menu");
                        break;
                    case 2:
                        System.out.println("Welcome to Wireless Menu");
                        break;
                    case 3:
                        System.out.println("Welcome to Accounts Menu");
                        break;
                    case 4:
                        System.out.println("Welcome to Billing Menu");
                        break;
                    default:
                        System.err.println("Wrong input");


                }
                break;
            case 2:
                System.out.print("Forwarding to French Menu");
                break;

            default:
                System.err.println("Wrong input");
        }
    }

}
