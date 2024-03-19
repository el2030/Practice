package Folder3;

public class RemoveSpace {
    public static void main(String[] args) {
        System.out.println(removeS("My Name Is Space"));

    }
    public static String removeS(String input){
        int l = input.length();
        String result = "";
        for (int i =0; i<l; i++){
            if (input.charAt(i) != ' '){
                result+=input.charAt(i);
            }
        }
        return result;
    }
}
