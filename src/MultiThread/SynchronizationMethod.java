package MultiThread;

public class SynchronizationMethod {
    synchronized void printTable(int num){
        for (int i=1; i<11; i++){
            System.out.println(i*num + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        SynchronizationMethod sm = new SynchronizationMethod();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                sm.printTable(5);
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                sm.printTable(9);
            }
        });
        t2.start();
    }
}
