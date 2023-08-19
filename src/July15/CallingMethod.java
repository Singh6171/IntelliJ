package July15;

public class CallingMethod {
    public static void main(String[] args) {
        System.out.println(getName());

        String name = getName();// same ouput via variable
        System.out.println(name);
    }
    public static String getName(){
        return "Chirag";
    }
}

