package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class StringConcatenation {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("one");
        test.add("twO");
        test.add("THreE");
        System.out.println(stringIt(test));
    }

    public static String stringIt(List<String> input){
        return input.stream().reduce("",String::concat);
    }
}
