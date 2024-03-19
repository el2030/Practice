package Folder3;

public class CharacterDigit {
    public static void main(String[] args) {
        checkDigti('9');
        checkDigti('A');
    }

    public static void checkDigti(char c){
        String digits = "0123456789";
        int d = digits.length();
        if (digits.contains(String.valueOf(c))){
            System.out.println(c + " IS a digit");
        } else {
            System.out.println(c + " is NOT a digit");}
    }
}
