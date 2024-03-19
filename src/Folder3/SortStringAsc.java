package Folder3;

import java.util.Arrays;

public class SortStringAsc {
    public static void main(String[] args) {
        System.out.println(sortAsc("Software"));
    }
    public static String sortAsc(String input){
        int l = input.length();
        char[] charArray = new char[l];
        String result = "";
        for (int i=0; i<l; i++){
            charArray[i] = input.charAt(i);
            }
        Arrays.sort(charArray);
        for (int i=0; i<l; i++) {
            result += charArray[i];

        }
        return result;
    }
}
