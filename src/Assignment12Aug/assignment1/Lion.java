package Assignment12Aug.assignment1;

public class Lion implements Animal, Roar{
    @Override
    public void feed() {
        System.out.println("Eats Meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Makes sound");
    }

    @Override
    public void canRoar() {
        System.out.println("It can Roar");
    }
}
