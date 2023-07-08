package loops;

public class NaturalNumberSum {
    public static void main(String[] args) {
        int naturalNum = 10;
        int result = 0;
        int incriment = 1;


        while (incriment <= naturalNum) {


            result = result + incriment;
            System.out.println(result);

            incriment++;
        }
        System.out.println("Result = " + result);

        }
    }

