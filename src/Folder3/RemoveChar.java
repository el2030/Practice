package Folder3;

public class RemoveChar {
    public static void main(String[] args) {
        System.out.println(remove("Jalapeno",'a'));

    }
    public static String remove(String input, char c){
        int l = input.length();
        String result = "";
        for (int i=0; i<l; i++){
            if (input.charAt(i) != c){
                result += input.charAt(i);
            }
        }
        return result;
    }
}
