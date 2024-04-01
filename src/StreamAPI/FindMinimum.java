package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindMinimum {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(23);
        test.add(102);
        test.add(25);
        test.add(10);
        test.add(2);
        System.out.println(findIt(test));;
    }

    public static int findIt(List<Integer> input){
        return input.stream().sorted().findFirst().get();
    }
}
