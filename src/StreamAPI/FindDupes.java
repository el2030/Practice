package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindDupes {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(23);
        test.add(102);
        test.add(23);
        test.add(10);
        test.add(25);
        test.add(52);
        test.add(52);
        test.add(24);
        System.out.println(findIt(test));;
    }

    public static List<Integer> findIt(List<Integer> input){
        List<Integer> noDupesList = input.stream().distinct().toList();
        noDupesList.forEach(input::remove);
        return input;
    }
}
