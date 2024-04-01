package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseConversion {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("one");
        test.add("twO");
        test.add("THreE");
        System.out.println(convertIt(test));
    }

    public static List<String> convertIt(List<String> input){
        return input.stream().map(String::toUpperCase).collect(Collectors.toList());
    };

}
