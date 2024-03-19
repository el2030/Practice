package Folder3;

public class SumInString {
    public static void main(String[] args) {
        System.out.println(sum("7", "3"));

    }
    public static String sum(String string1, String string2){
        int num1 = Integer.parseInt(string1);
        int num2 = Integer.parseInt(string2);
        return String.valueOf(num1 + num2);

    }
}
