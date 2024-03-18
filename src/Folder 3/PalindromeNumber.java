public class PalindromeNumber {

    public static void main(String[] args) {
        Verify(121);
        Verify(3456);
        Verify(1234321);
    }
    public static int Verify (int input){
        String stringInput = Integer.toString(input);
        int length = stringInput.length();
        int index = length - 1;
        for (int i=0; i<length/2; i++){
            if (stringInput.charAt(index) == stringInput.charAt(i)){
                index--;
                continue;
            }
            else {
                System.out.println(input + " is NOT a palindrome");
                return -1;
            }
        }
        System.out.println(input + " IS a palindrome");
        return -1;

    }
}
