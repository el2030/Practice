package MultiThread;

public class ThreadGroupExample implements Runnable {

    public static void main(String[] args) {

        ThreadGroupExample threadGroupExample = new ThreadGroupExample();
        ThreadGroup tg = new ThreadGroup("Container");
        Thread t1 = new Thread(tg, threadGroupExample, "DateTime.First");
        t1.start();
        Thread t2 = new Thread(tg, threadGroupExample, "Second");
        t2.start();
        Thread t3 = new Thread(tg, threadGroupExample, "Third");
        t3.start();
        Thread t4 = new Thread(tg, threadGroupExample, "Fourth");
        t4.start();

        System.out.println(tg.getName());



    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
