package Folder3;

public class RemoveNonRepeat {
    public static void main(String[] args) {
        System.out.println(removeN("Repeatinnnnngggg"));
    }
    public static String removeN(String input){
        int l = input.length();
        StringBuilder result = new StringBuilder();
        if (input.charAt(0) == input.charAt(1)){
            result.append(input.charAt(0));
        }
        for (int i=1; i<l; i++){
            if (input.charAt(i) == input.charAt(i-1)){
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }
}
