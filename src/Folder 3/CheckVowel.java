public class CheckVowel {
    public static void main(String[] args) {
        check('o');
        check('a');
        check('T');

    }
    public static void check(char c){
        String vowels = "AEIOUaeiou";
        if (vowels.contains(String.valueOf(c))){
            System.out.println(c + " is a vowel");
        }
        else {
            System.out.println(c + " is a consonant");
        }

    }
}
