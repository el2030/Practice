package Folder3;

public class Anagram {
    public static void main(String[] args) {
        verifyAnagram("astronomer", "moon starer");

    }
    public static void verifyAnagram(String input1, String input2){
        String[] stringArray1 = input1.split(" ");
        String[] stringArray2 = input2.split(" ");
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        for (String word: stringArray1){
            result1.append(word);
        }
        for (String word: stringArray2){
            result2.append(word);
        }
        int l1 = result1.length();
        int l2 = result2.length();
        if (l1 != l2){
            System.out.println("The two strings are NOT anagram");
            return;
        }
        StringBuilder result = new StringBuilder();
        for (int i=0; i<l1; i++){
            for (int j=0; j<l2; j++){
                if (input1.charAt(i) == input2.charAt(j)){
                    result.append(input1.charAt(i));
                    break;
                }
            }
        }
        if (result.length() == l2){
            System.out.println("The two strings ARE anagram");
        } else {
            System.out.println("The two strings are NOT anagram");
        }

    }

}
