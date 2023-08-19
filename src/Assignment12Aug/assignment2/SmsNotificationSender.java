package Assignment12Aug.assignment2;

import java.util.Scanner;

public class SmsNotificationSender implements SmsNotification{
    @Override
    public void specifyPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        int phone = sc.nextInt();
        System.out.println("Phone number set to : " + phone);
    }

    @Override
    public void sendingSmsNotification() {
        System.out.println("sending sms notification");
    }
}
