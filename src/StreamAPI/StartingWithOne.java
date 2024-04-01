package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StartingWithOne {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(21);
        test.add(12);
        test.add(13);
        test.add(31);
        test.add(17);
        test.add(109);
        test.add(51);
        System.out.println(listIt(test));
    }
    public static List<Integer> listIt(List<Integer> input){
        return input.stream().filter(num -> num.toString().startsWith("1")).collect(Collectors.toList());
    }
}
