package StreamAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SquareList {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(23);
        test.add(102);
        test.add(25);
        test.add(10);
        test.add(2);
        System.out.println(squareIt(test));;
    }
    public static List<Integer> squareIt(List<Integer> input){
        return input.stream().map(num -> num*num).collect(Collectors.toList());
    }
}
