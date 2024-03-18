public class Palindrome {

    public static void main(String[] args) {
        String kayak = "kayak";
        Verify(kayak);
        String trash = "trash";
        Verify(trash);
    }

    public static int Verify (String input){
        int length = input.length();
        int index = length - 1;
        for (int i=0; i<length/2; i++){
                if (input.charAt(index) == input.charAt(i)){
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
