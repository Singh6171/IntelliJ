package Assignment12Aug.assignment2;

import java.util.Scanner;

public class EmailNotificationSender implements EmailNotification{



    @Override
    public void settingRecipients() {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        System.out.println("Email set to : " + email);
    }

    @Override
    public void sendingEmailnotification() {
        System.out.println("sending email notification");
    }
}
