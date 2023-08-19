package Assignment12Aug.assignment1;

public class AnimalMain {
    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println("Lion:");
        lion.feed();
        lion.makeSound();
        lion.canRoar();
        System.out.println(" ");

        Penguin penguin = new Penguin();
        System.out.println("Penguin:");
        penguin.feed();
        penguin.makeSound();
        penguin.canSwim();
        System.out.println(" ");

        Monkey monkey = new Monkey();
        System.out.println("Monkey:");
        monkey.feed();
        monkey.makeSound();
        monkey.canClimb();

    }
}
