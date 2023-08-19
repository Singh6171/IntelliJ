package loops;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String exit;
        do {
        int firstNumber;
        System.out.println("Please enter First Number");
        firstNumber = sc.nextInt();

        int secondNumber;
        System.out.println("Please enter Second Number");
        secondNumber = sc.nextInt();


        int thirdNumber;
        System.out.println("Please enter Third Number");
        thirdNumber = sc.nextInt();

            if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
                System.out.println(firstNumber + " is greatest number");
            } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
                System.out.println(secondNumber + " is greatest number");
            } else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber)) {
                System.out.println(thirdNumber + " is greatest number");
            } else if (firstNumber == secondNumber && secondNumber == thirdNumber) {
                System.out.println("All are equal");
            } else {
                System.out.println("Invalid Input");
            }
            System.out.println("Do you want to Exit (Y/N):");
            exit = sc.next();


        }
        while(exit == "Y");

    }
}
