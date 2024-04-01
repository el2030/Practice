public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverseIt("OkayDone"));
    }

    public static String reverseIt(String input){
        int l = input.length();
        StringBuilder result = new StringBuilder();
        for (int i=l-1; i>-1; i--){
            result.append(input.charAt(i));
        }
        return result.toString();
    }
}
