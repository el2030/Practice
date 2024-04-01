package Folder3;

public class RemoveSpace {
    public static void main(String[] args) {
        System.out.println(removeS("My Name Is Space"));
        System.out.println(removeS("Testing  double  spaces  ."));

    }
    public static String removeS(String input){
        //Not using String.split();
//        int l = input.length();
//        StringBuilder result = new StringBuilder();
//        for (int i =0; i<l; i++){
//            if (input.charAt(i) != ' '){
//                result.append(input.charAt(i));
//            }
//        }
//        return result.toString();
        //Not using String.replace();
//        String[] stringArray = input.split(" ");
//        StringBuilder result = new StringBuilder();
//        for (String word: stringArray){
//            result.append(word);
//        }
//        return result.toString();
        return input.replace(" ","");
    }
}
