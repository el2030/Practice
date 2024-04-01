package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class StringCount3 {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("one");
        test.add("twO");
        test.add("THreE");
        System.out.println(countIt(test));
    }
    public static long countIt(List<String> input){
        return input.stream().filter(word -> word.length()>3).count();
    }
}
