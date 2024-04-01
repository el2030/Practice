package Generics;

import javax.swing.event.DocumentEvent;
import java.util.ArrayList;
import java.util.List;

abstract class Electronic{
    abstract void task();
}
class Phone extends Electronic{

    @Override
    void task() {
        System.out.println("Phone");
    }
}

class Laptop extends Electronic{

    @Override
    void task() {
        System.out.println("Laptop");
    }
}
public class WildCardGeneric {

    public static void taskByElectronic(List<? extends Electronic> list){
        for(Electronic e: list){
            e.task();
        }
    }

    public static void main(String[] args) {
        List<Laptop> al = new ArrayList<>();
        al.add(new Laptop());

        List<Phone> al2 = new ArrayList<>();
        al2.add(new Phone());
        al2.add(new Phone());
        al2.get(1).task();
        taskByElectronic(al);
        taskByElectronic(al2);
    }
}
