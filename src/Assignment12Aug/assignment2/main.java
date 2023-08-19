package Assignment12Aug.assignment2;

public class main {
    public static void main(String[] args) {
        EmailNotificationSender ee = new EmailNotificationSender();
        System.out.println("Input Email");
        ee.settingRecipients();
        ee.sendingEmailnotification();

        SmsNotificationSender ss = new SmsNotificationSender();
        System.out.println("Input Phone number");
        ss.specifyPhoneNumber();
        ss.sendingSmsNotification();

        PushNotificationSender pp = new PushNotificationSender();
        pp.sendingPushNotification();
    }
}
