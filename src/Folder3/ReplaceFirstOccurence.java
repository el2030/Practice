package Folder3;

public class ReplaceFirstOccurence {
    public static void main(String[] args) {
        System.out.println(replaceFirst("Private"));

    }
    public static String replaceFirst(String input) {
        int l = input.length();
        String vowels = "AEIOUaeiou";
        int v = vowels.length();
        String result = "";
        for (int i = 0; i < l; i++) {
            for (int j=0; j<v; j++){
                if (input.charAt(i) == vowels.charAt(j)){
                    result += '-';
                    i++;
                    while(i<l){
                        result += input.charAt(i);
                        i++;
                    }
                    return result;
                }
            }
            result += input.charAt(i);
        }
        return result;
    }
}
