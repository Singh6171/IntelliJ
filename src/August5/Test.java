package August5;

public class Test {
    int a;
    int b;

    private   Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void getTest(){
        Test test = new Test(11,22);
        System.out.println(test);

    }

}
