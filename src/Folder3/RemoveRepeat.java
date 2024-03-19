package Folder3;

public class RemoveRepeat {
    public static void main(String[] args) {
        System.out.println(removeR("Repeatinnnnngggg"));
    }
    public static String removeR(String input){
        int l = input.length();
        String result = "";
        result += input.charAt(0);
        for (int i=1; i<l; i++){
            if (input.charAt(i) != input.charAt(i-1)){
                result += input.charAt(i);
            }
        }
        return result;
    }
}
