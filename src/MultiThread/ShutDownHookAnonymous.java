package MultiThread;

public class ShutDownHookAnonymous {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run(){
                System.out.println("Shutdown hook anonymous executed");
            }
        });

        System.out.println("Main ended");
    }
}
