public class LongestSubString {

    public static void main(String[] args) {
        System.out.println(findIt("test"));
    }

    public static String findIt(String input){
        int l = input.length();
        int longest = 0;
        int current = 1;
        StringBuilder builder = new StringBuilder();
        builder.append(input.charAt(0));
        for (int i=1; i<l; i++){
            if (input.charAt(i-1) != input.charAt(i)){
                current++;
                if (current>longest) longest = current;
            } else {
                if (current>longest) longest = current;
                for (int j=i-current; j<current; j++){
                    builder.append(input.charAt(j));
                }
                current = 1;
            }
        }
        return builder.toString();

    }
}
