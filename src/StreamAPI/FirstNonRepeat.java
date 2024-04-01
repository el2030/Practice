package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class FirstNonRepeat{
    //to be completed
    public static void main(String[] args) {
        String test = "JjaaVaaProggramminng";
        System.out.println(findIt(test));
    }
    public static char findIt(String input){
        input = input.toUpperCase();
        int count = 0;
        
        List<Character> charList = new ArrayList<>();
        for (char c: input.toCharArray()){
            charList.add(c);
        }
        return 'c';
    }
}
