package Assignment12Aug.assignment1;

public class Monkey implements Animal,Climbable{
    @Override
    public void feed() {
        System.out.println("Eats banana");
    }

    @Override
    public void makeSound() {
        System.out.println("Makes sound");
    }

    @Override
    public void canClimb() {
        System.out.println("It can climb");
    }
}
