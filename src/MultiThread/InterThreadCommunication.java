package MultiThread;

class Record{
    int burger = 10;
    synchronized void booking(int quantity){
        if (burger < quantity) {
            try {
                System.out.println("Please wait");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Can't accept order");
        }
        burger -= quantity;
    }

    synchronized void cook (int quantity){
        burger += quantity;
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        Record rec = new Record();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                rec.booking(9);
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                rec.booking(3);
            }
        });
        t2.start();


    }
}
