package Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UnboundedWildCard {
    public static Double total(List<?> list1){
        Double sum = 0.0;
        for (Object num:list1){
            if (num instanceof Integer){
                sum += (Integer)num;
            } else {
                sum += (Double)num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Double> al = new ArrayList<>();
        al.add(23.0d);
        al.add(90.1d);
        al.add(56.2d);
        al.add(34.3d);
        System.out.println(total(al));

        List<Integer> alint = new ArrayList<>();
        alint.add(23);
        alint.add(90);
        alint.add(56);
        alint.add(34);
        System.out.println(total(alint));
    }
}
