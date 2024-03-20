package Folder3;

import java.util.Arrays;

public class SortStringDsc {
    public static void main(String[] args) {
        System.out.println(sortAsc("Software"));
    }
    public static String sortAsc(String input){
        int l = input.length();
        char[] charArray = new char[l];
        StringBuffer result = new StringBuffer();
        input.getChars(0,l,charArray,0);
        Arrays.sort(charArray);
        for (int i=l-1; i>-1; i--) {
            result.append(charArray[i]);

        }
        return result.toString();
    }
}
