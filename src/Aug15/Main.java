package Aug15;

public class Main {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.show();

        OuterClass.InnerClass in = out.new InnerClass();
        in.display();
    }
}
