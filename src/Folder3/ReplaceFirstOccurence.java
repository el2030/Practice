package Folder3;

public class ReplaceFirstOccurence {
    public static void main(String[] args) {
        System.out.println(replaceFirst("Private"));

    }
    public static String replaceFirst(String input) {
        int l = input.length();
        String vowels = "AEIOUaeiou";
        int v = vowels.length();
        for (int i=0; i<l; i++){
            if (vowels.contains(String.valueOf(input.charAt(i)))){
                input = input.replace(input.charAt(i), '-');
                return input;
            }
        }
        return input;
    }
}
