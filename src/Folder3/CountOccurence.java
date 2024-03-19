package Folder3;

public class CountOccurence {
    public static void main(String[] args) {
        System.out.println(count("Banana",'a'));

    }
    public static int count(String input, char c) {
        int l = input.length();
        int count = 0;
        for (int i = 0; i < l; i++) {
            if (input.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
