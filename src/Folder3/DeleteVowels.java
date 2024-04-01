package Folder3;

public class DeleteVowels {
    public static void main(String[] args) {
        System.out.println(deleteV("Pineapple"));

    }

    public static String deleteV(String input){
        //Not using String.replace();
//        String vowels = "AEIOUaeiou";
//        StringBuilder result = new StringBuilder();
//        int v = vowels.length();
//        int l = input.length();
//        for (int i=0; i<l; i++){
//            if (!vowels.contains(String.valueOf(input.charAt(i)))){
//                result.append(input.charAt(i));
//            }
//        }
//        return result.toString();
        return input.replaceAll("[AEIOUaeiou]","");
    }

}
