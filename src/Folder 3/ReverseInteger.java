public class ReverseInteger {
    public static void main(String[] args) {

        System.out.println(reverse(123));
        System.out.println(reverse(56789));

    }
    public static int reverse(int input){
        String stringInput = Integer.toString(input);
        int length = stringInput.length();
        String result = "";
        for (int i=length-1; i>-1; i--){
            result += stringInput.charAt(i);
        }
        return Integer.parseInt(result);


    }
}
