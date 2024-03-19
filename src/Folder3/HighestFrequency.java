package Folder3;

import java.util.Arrays;

public class HighestFrequency {
    static char mostChar;
    static int highestCount;
    public static void main(String[] args) {
        System.out.println("Most frequent character is :" + showHighest("sixoooooofiveppppp"));
        System.out.println("Most frequent character is :" + showHighest("sevenaaaatwobabaa"));
    }
    public static char showHighest(String input){
        int l = input.length();
        int count = 1;
        char[] charArray = new char[l];
        for (int i=0; i<l; i++){
            charArray[i] = input.charAt(i);
        }
        Arrays.sort(charArray);
        mostChar = charArray[0];
        for (int i=1; i<l; i++){
            if (charArray[i-1] == charArray[i]){
                count++;
                if (count>highestCount){
                    highestCount = count;
                    mostChar = charArray[i];
                }
            } else {count = 1;}
        }
        return mostChar;
    }
}
