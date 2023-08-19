package August1;

public class ParameterizedConstructor {
    public static void main(String[] args) {

        Date Date1 = new Date(1,8,2023);
        Date1.getDate();

        Date Date2 = new Date(1,8);
        Date2.getDate();

        Date Date3 = new Date(1);
        Date3.getDate();

        Date Date = new Date();
        Date.getDate();
    }
}
