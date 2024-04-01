package StreamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class PrintCount {
    public static void main(String[] args) {
        String test = "JavaProgramming";
        countIt(test);
    }

    public static void countIt(String input){
        input = input.toUpperCase();
        List<Character> charList = new ArrayList<>();
        HashMap<Character, Integer> m1 = new HashMap<>();
        for (char c: input.toCharArray()){
            charList.add(c);
        }
        charList.stream().forEach(c -> m1.put(c, 0));
        charList.stream().forEach(c -> m1.put(c, m1.get(c)+1));
        m1.forEach((key,value) -> System.out.println("Letter " + key + "\t count: " + value));

    }

}
