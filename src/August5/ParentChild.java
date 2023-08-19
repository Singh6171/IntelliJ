package August5;

public class ParentChild {
    public static void main(String[] args) {
        Mac mac = new Mac();
        mac.setOS("Mac OS");
        mac.setPrice(1200);
        mac.setType("Notebook");
        mac.setProcessor("M1");


        mac.getProcessor();
        mac.getOS();
        mac.getPrice();
        mac.getType();
    }
}
