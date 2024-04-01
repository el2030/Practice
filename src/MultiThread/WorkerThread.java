package MultiThread;

public class WorkerThread implements Runnable{
    String message;

    public WorkerThread(String message){
        super();
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Message is " + message );
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+ "End");
    }


}
