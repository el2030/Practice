package SerializationTest;

import java.io.*;

public class TestSerialization {
    public static void main(String[] args) {
        ObjectInputStream oos = null;
        try (FileInputStream fos = new FileInputStream("product.ser")) {
            oos = new ObjectInputStream(fos);
            Product p1 = (Product) oos.readObject();
            Product p2 = (Product) oos.readObject();
            System.out.println("p1: " + p1);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
