package MultiThread;

public class DeadLockExample {

    public static void main(String[] args) {
        final String resource = "Key";
        final String resource2 = "Rav";

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource){
                    System.out.println("Thread 1 is using");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (resource2){
                        System.out.println("Thread 1 is");
                    }
                }
            }
        });
    }
}
