package MultiThread;

public class MultiplicationTwo implements Runnable{
    static int multiplication = 2;
    static int num = 0;

    public static void main(String[] args) {
        MultiplicationTwo m2 = new MultiplicationTwo();
        Thread t1 = new Thread(m2);
        Thread t2 = new Thread(m2);
        t2.setName("Print");
        t2.start();
        t1.start();
    }

    public void twoTable(){
        for (int i=0; i<11; i++) {
            num = i;
            System.out.println(multiplication + "x" + num + " = " + multiplication * num);
        }
    }

    public void printMultiThreading(){
        System.out.println("Multithreading is a feature of Java.");
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Print")) printMultiThreading();
        else twoTable();
    }
}
