package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CubeFifty {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(2);
        test.add(5);
        test.add(6);
        test.add(7);
        test.add(1);
        test.add(3);
        test.add(4);
        test.add(9);
        System.out.println(cubeIt(test));;
    }

    public static List<Integer> cubeIt(List<Integer> input){
        return input.stream().map(num -> num*num*num).filter(num -> num > 50).collect(Collectors.toList());
    }
}
