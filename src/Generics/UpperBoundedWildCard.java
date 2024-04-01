package Generics;
import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildCard {
    public static Double total(List<? extends Number> list1){
        double sum = 0;
        for (Number num:list1){
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(23);
        al.add(90);
        al.add(56);
        al.add(34);
        System.out.println(total(al));
    }
}
