package Generics;

public class GenericsExamples {
    public static void main(String[] args) {
//        ArrayList<String> al = new ArrayList<>();
//        //al.add(90);
//        al.add("23");
//        //al.add(90.34f);
//        System.out.println(al);
        Product pro = new Product<>(1, "Phone", 1200.34f,10);
        Product pro2 = new Product<>();
        pro2.setId(2);
        pro2.setName("Android");
        pro2.setPrice("500");
        pro2.setQuantity(50);
        System.out.println(pro);
        System.out.println(pro2);
    }
}
