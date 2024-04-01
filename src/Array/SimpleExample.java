package Array;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(82);
        al.add(13);

        Consumer<String> consumer = (msg) -> {
            System.out.println(msg);
        };

        al.stream().forEach((msg) ->System.out.println(msg));

        Predicate<Integer> predicate = (num) -> num %2==0;
        al.stream().filter((num) -> predicate.test(num)).forEach(System.out::println);
        al.stream().filter((num) -> num%2!=0).forEach(System.out::println);
        al.stream().map((num) -> num%2==0 ? num+5: num-5).forEach(System.out::println);
        Stream.iterate(1, num->num+1).limit(10).forEach(System.out::println);
        Stream.iterate(1, num->num+1)
                .filter((num)-> num%5==0)
                .limit(10)
                .forEach(System.out::println);

        int total = al.stream().reduce(0, (sum, num) -> sum+num);
        System.out.println(total);
        int total2 = al.stream().filter((num) -> num%2!=0).reduce(0, Integer::sum);
        System.out.println(total2);

        //List<Integer> oddNumber = al.stream().filter((num)-> num%2!=0).collect(Collection);

        Set<Integer> unique = al.stream().collect(Collectors.toSet());
        System.out.println(unique);

        al.stream().distinct().forEach(System.out::println);

        long count = al.stream().filter((num) -> num%2==0).count();
        System.out.println(count);

    }
}
