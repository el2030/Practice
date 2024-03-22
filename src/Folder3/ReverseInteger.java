package Folder3;
public class ReverseInteger {
    public static void main(String[] args) {

        System.out.println(reverse(123));
        System.out.println(reverse(-56789));

    }
    public static int reverse(int input){
        String stringInput = Integer.toString(input);
        int length = stringInput.length();
        StringBuilder result = new StringBuilder();
        if (stringInput.charAt(0) == '-'){
            result.append('-');
        }
        for (int i=length-1; i>-1; i--){
            if (stringInput.charAt(i) != '-'){
                result.append(stringInput.charAt(i));
            }
        }

        return Integer.parseInt(result.toString());


    }
}
