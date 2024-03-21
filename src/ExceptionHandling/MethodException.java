package ExceptionHandling;

public class MethodException {
    public static void main(String[] args) {

        try{
            causeException();
        } catch (ArithmeticException a){
            a.printStackTrace();
        } finally {
            System.out.println("Main executed successfully");
        }
    }

    public static void causeException(){
        int one = 1;
        int zero = 0;
        int result = one/zero;
        System.out.println("Method executed successfully");
    }
}
