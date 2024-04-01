package GarbageCollection;

public class GarbageCollection {

    public static void main(String[] args) {
        GarbageCollection gc = new GarbageCollection();
        gc = null;

        GarbageCollection gc2 = new GarbageCollection();
        GarbageCollection gc3 = new GarbageCollection();
        gc3 = gc2;

        System.gc();
    }
}
