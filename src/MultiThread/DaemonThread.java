package MultiThread;

public class DaemonThread extends Thread{

    static void series1(){
        for (int i=1; i <= 10; i++){
            System.out.println(i);
        }
    }

    static void series2(){
        for (int i=100; i<110; i++){
            System.out.println(i);
        }
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Hello")){
            series1();
        } else series2();
    }

    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        DaemonThread notDaemon = new DaemonThread();
        notDaemon.setName("Hello");
        notDaemon.start();
        daemonThread.setName("NotHello");
        daemonThread.setDaemon(true);
        daemonThread.start();

    }
}
