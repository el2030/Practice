package Folder3;

public class DeleteVowels {
    public static void main(String[] args) {
        System.out.println(deleteV("Pineapple"));

    }

    public static String deleteV(String input){
        String vowels = "AEIOUaeiou";
        String result = "";
        int v = vowels.length();
        int l = input.length();
        for (int i=0; i<l; i++){
            if (!vowels.contains(String.valueOf(input.charAt(i)))){
                result += input.charAt(i);
            }
        }
        return result;
    }

}
