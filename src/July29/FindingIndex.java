package July29;

public class FindingIndex {
    public static void main(String[] args) {
        String s1 = "PRAGRA";

        char[] ch1 = s1.toCharArray();

        char c = 'G';
        for (int i = 0; i < ch1.length ; i++) {
            if (ch1[i] == c){
            System.out.println("Character g is at index: " + i);
            }

        }
    }
}
