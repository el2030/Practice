import java.util.Arrays;
import java.util.Stack;

public class ReverseAndSort {

    public static void main(String[] args) {
        String[] fiveword= {"cat", "fish", "dog", "horse", "star"};
        String[] output = (FiveWord(fiveword));
        Arrays.sort(output);
        System.out.println("Input: "+ Arrays.toString(fiveword));
        System.out.println("Output: " + Arrays.toString(output));
    }

    public static String[] FiveWord (String[] fiveword) {
        String[] result = new String[5];
        int counter = 0;
        for (String word : fiveword) {
            String newWord = "";
            int n = word.length();
            for (int i=n-1; i>=0; i--){
                newWord += word.charAt(i);
                result[counter] = newWord;
            }
            counter++;
        }
        return result;
    }


}
