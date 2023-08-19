package July29;

public class FindingArrayElement {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,8,6,7};
        int num1 = 8;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num1){
                System.out.println("the number 8 is on index " + i);
            }
        }
    }
}
