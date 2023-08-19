package July29;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        int arr1[] = {22, 33, 44, 55, 3, 100, 66, 77, 88, 99, 11};
        int num1 = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < num1) {
                num1 = arr1[i];
            }
        }System.out.println("the smallest number is " + num1);
    }
}