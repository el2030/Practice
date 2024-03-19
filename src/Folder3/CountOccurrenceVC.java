package Folder3;

public class CountOccurrenceVC {
    public static void main(String[] args) {
        CountOccur("Calculator");
        CountOccur("Occurrence");
    }
    public static void CountOccur(String input){
        String vowels = "AEIOUaeiou";

        int consonantCount = 0;
        int v = vowels.length();
        int l = input.length();
        for (int i=0; i<l; i++){
            if (!vowels.contains(String.valueOf(input.charAt(i)))){
                consonantCount++;
            }
        }
        int vowelCount = l-consonantCount;
        System.out.println("The count for consonants in " + input + " is " + consonantCount);
        System.out.println("The count for vowels " + input + " is " + vowelCount);

    }
}
