package August12;

public class Sparrow extends Bird{
    @Override
    public void name() {
        System.out.println("This is Sparrow");
    }

    @Override
    public void color() {
        System.out.println("It comes in many colours mainly grey");
    }

    @Override
    public void alive() {
        System.out.println("It is found less nowadays");
    }

    @Override
    public void size() {
        System.out.println("it is a small bird");
    }
}
