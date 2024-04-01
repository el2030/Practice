package Generics;

public class ElementType {
    public static <E> void printData(E[] data){
        for (E element:data){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intdata = {12,23,34,45,67,43};
        String[] stringArray = {"String", "Array"};
        printData(intdata);
        printData(stringArray);
    }
}
