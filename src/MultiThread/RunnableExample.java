package MultiThread;
import java.lang.Thread;

public class RunnableExample implements Runnable{

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
        if (Thread.currentThread().getName().equals("Ethan")){
            series1();
        } else series2();
    }

    public static void main(String[] args){
        RunnableExample r1 = new RunnableExample();
        Thread t1 = new Thread(r1);
        t1.setName("Ethan");
        t1.setPriority(10);
        t1.start();

        Thread t2 = new Thread(r1);
        t2.setName("notEthan");
        t2.setPriority(9);
        t2.start();
    }
}
