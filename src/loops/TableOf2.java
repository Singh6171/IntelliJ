package loops;

public class TableOf2 {
    public static void main(String[] args) {
        int num = 0; int base = 2;
        while(num <= 10){
            System.out.println("2 * "+ num + " = " + (base * num));
            num ++;
        }
    }
}
