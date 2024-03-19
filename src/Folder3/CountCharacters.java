package Folder3;

public class CountCharacters {
    public static void main(String[] args) {

        countAll("@38Ajdf83%$");

    }

    public static void countAll(String input){
        int l = input.length();
        int numCount=0;
        int alphaCount=0;
        int specialCount=0;
        String nums = "0123456789";
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String update = "";
        for (int i=0; i<l; i++){
            if (nums.contains(String.valueOf(input.charAt(i)))){
                numCount++;
                continue;
            } else {
                update += input.charAt(i);
            }
        }
        update = update.toUpperCase();
        int m = update.length();
        for (int i=0; i<m; i++){
            if (alphabets.contains(String.valueOf(update.charAt(i)))){
                alphaCount++;
            } else {
                specialCount++;
            }
        }
        System.out.println("The count for digits is " + numCount);
        System.out.println("The count for alphabets is " + alphaCount);
        System.out.println("The count for special characters is " + specialCount);

    }
}
