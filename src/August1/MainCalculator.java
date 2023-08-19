package August1;

public class MainCalculator {
    public static void main(String[] args) {
        ConstructorCalculator calc = new ConstructorCalculator(2.1, 2.2);
        calc.add();

        ConstructorCalculator calc1 = new ConstructorCalculator(2.2,2.3);
        calc1.sub();

        ConstructorCalculator calc2 = new ConstructorCalculator(2.3,2.4);
        calc2.multi();

        ConstructorCalculator calc3 = new ConstructorCalculator(2.4,2.5);
        calc3.div();

    }
}
