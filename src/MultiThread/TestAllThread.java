package MultiThread;

public class TestAllThread extends Thread {
    void series(){
        for(int i=1; i<11; i++){
            System.out.println(i + Thread.currentThread().getName());
        }
    }
    @Override
    public void run() {
        series();
    }

    public static void main(String[] args) {
        TestAllThread t1 = new TestAllThread();
        t1.start();

        TestAllThread t2 = new TestAllThread();
        t2.start();

        TestAllThread t3 = new TestAllThread();
        t3.start();
    }
}
