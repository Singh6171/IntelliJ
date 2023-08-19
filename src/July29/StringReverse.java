package July29;

public class StringReverse {
    public static void main(String[] args) {
        String st = "PRAGRA";
        System.out.println(" Original String " + st);

        // Converting string to the array for reversing
        char[] charArray = st.toCharArray();
        for(char n:charArray){
            System.out.println(" " + n );
        }
        for (int i = charArray.length-1; i >=0 ; i--) {
            System.out.println(" ");
            System.out.println(charArray[i]);
        }

    }
}
