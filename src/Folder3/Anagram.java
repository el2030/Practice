package Folder3;

public class Anagram {
    public static void main(String[] args) {
        verifyAnagram("listen", "silent");

    }
    public static void verifyAnagram(String input1, String input2){
        int l1 = input1.length();
        int l2 = input2.length();
        String result = "";
        for (int i=0; i<l1; i++){
            for (int j=0; j<l2; j++){
                if (input1.charAt(i) == input2.charAt(j)){
                    result += input1.charAt(i);
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
