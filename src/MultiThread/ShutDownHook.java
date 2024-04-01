package MultiThread;

public class ShutDownHook extends Thread{

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
    public void run(){
        System.out.println("Shutdown hook");
        if (Thread.currentThread().getName().equals("Ethan")){
            try {
                series1();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else try {
            series2();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        ShutDownHook shutDownHook = new ShutDownHook();
        ShutDownHook s1 = new ShutDownHook();
        s1.setName("Ethan");
        s1.start();

        ShutDownHook s2 = new ShutDownHook();
        s2.setName("Rod");
        s2.start();
        Runtime runtime = Runtime.getRuntime();
        runtime.addShutdownHook(shutDownHook);
        System.out.println("Press ctrl + c to shut down");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
