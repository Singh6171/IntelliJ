package August1;

public class ConstructorCalculator {
    private double num1;
    private double num2;

    ConstructorCalculator(){}

    public ConstructorCalculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add(){
        System.out.println("Sum is: "+(num1+num2));
    }
    public void sub(){
        System.out.println("Substraction is: " +(num2 - num1));
    }

    public void multi(){
        System.out.println("Multiplication is: "+ (num2*num1));
    }

    public void div(){
        System.out.println("Division is: " + (num1/num2));
    }
}
