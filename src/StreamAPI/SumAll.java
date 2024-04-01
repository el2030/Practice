package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class SumAll {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(23);
        test.add(102);
        test.add(25);
        test.add(10);
        test.add(2);
        System.out.println(sumIt(test));;
    }

    public static int sumIt(List<Integer> input){
        return input.stream().reduce(0,Integer::sum);
    }
}
