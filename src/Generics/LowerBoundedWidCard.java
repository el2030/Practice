package Generics;
import java.util.ArrayList;
import java.util.List;
public class LowerBoundedWidCard {

    public static Double total(List<? super Integer> list1){
        double sum = 0;
        for (Object num:list1){
            sum += (Integer)num;
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
