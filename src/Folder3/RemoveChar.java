package Folder3;

public class RemoveChar {
    public static void main(String[] args) {
        System.out.println(remove("Jalapeno",'a'));

    }
    public static String remove(String input, char c){
        int l = input.length();
        StringBuilder result = new StringBuilder();
        for (int i=0; i<l; i++){
            if (input.charAt(i) != c){
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }
}
