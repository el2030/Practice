package MultiThread;

public class RemoveShutDownHook {

    static class MyCode extends Thread{
        @Override
        public void run(){
            System.out.println("Shutdown hook executed");
        }
    }

    public static void main(String[] args) {
        MyCode myCode = new MyCode();
        Runtime.getRuntime().addShutdownHook(myCode);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Runtime.getRuntime().removeShutdownHook(myCode);
        System.out.println("Main ended");
    }
}
