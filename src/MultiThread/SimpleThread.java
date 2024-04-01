package MultiThread;

public class SimpleThread extends Thread {
    static void series1() throws Exception{
        for (int i=1; i <= 10; i++){
            System.out.println(i);
            if (i==5){
                throw new Exception("System can't execute now");
            }
        }
    }

    static void series2(){
        for (int i=100; i<110; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws Exception {
        SimpleThread s1 = new SimpleThread();
        s1.setName("Ethan");
        s1.start();

        SimpleThread s2 = new SimpleThread();
        s2.setName("");
        s2.start();
    }

    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("Ethan")){
           try {
               series1();
           } catch (Exception e){
               e.printStackTrace();
           }
        } else series2();
    }
}
