package Assignment12Aug.assignment1;

public class Penguin implements Animal, Swimmable{
    @Override
    public void feed() {
        System.out.println("Eats Fish");
    }

    @Override
    public void makeSound() {
        System.out.println("Makes sound");
    }

    @Override
    public void canSwim() {
        System.out.println("It can Swim");
    }
}
