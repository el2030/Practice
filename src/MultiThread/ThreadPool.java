package MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool{

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i=1; i<=10; i++){
            WorkerThread wt = new WorkerThread("Message " + i);
            executor.execute(wt);
        }
        executor.shutdown();
    }
}
