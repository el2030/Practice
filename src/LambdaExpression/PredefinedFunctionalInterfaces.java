package LambdaExpression;

import java.util.EnumMap;
import java.util.Enumeration;
import java.util.function.*;

public class PredefinedFunctionalInterfaces {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (num) -> {
            if (num %2 ==0){
                return true;
            } else return false;
        };
        System.out.println(predicate.test(12));

        Consumer<Integer> consumer = (num) -> {
            if (num%2==0){
                System.out.println("Even number");
            }
        };
        consumer.accept(90);

        Function<Integer, String> fun = (num) -> {
            if (num%2 == 0){
                return "Even number";
            } else return "Odd Number";
        };
        System.out.println(fun.apply(12));

        Supplier<String> sup = ()->{
            return "Welcome to Lambda";
        };
        System.out.println(sup.get());

        BiPredicate<Integer, Integer> biPredicate = (a, b) ->{
            if (a==b) return true; else return false;
        };

        System.out.println(biPredicate.test(1,12));

        BiConsumer<Integer, Integer> biConsumer = (a, b) ->{
            if (a==b) System.out.println("True"); else System.out.println("False");;
        };
        biConsumer.accept(12,23);

        BiFunction<Integer, Integer, Integer> biFunction = (a,b) ->{
            return Math.max(a,b);
        };
        System.out.println(biFunction.apply(12,23));
    }
}
