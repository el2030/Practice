package MultiThread;

public class OddEvenThread {

    int i = 1;
    static int num = 10;

    void printOdd() throws InterruptedException{
        synchronized (this){
            while (num > i){
                while (i%2 == 0){
                    wait();
                }
                System.out.println(i);
                i++;
                notify();
            }
        }
    }

    void printEven() throws InterruptedException{
        synchronized (this){
            while (num > i){
                while (i%2 != 0){
                    wait();
                }
                System.out.println(i);
                i++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        OddEvenThread ot = new OddEvenThread();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ot.printOdd();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ot.printOdd();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
