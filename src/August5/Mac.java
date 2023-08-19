package August5;

public class Mac extends Laptops {
    String OS;
    int price;

    public void getOS() {
        System.out.println("OS: " + OS);
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void getPrice() {
        System.out.println("Price: " + price);
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
