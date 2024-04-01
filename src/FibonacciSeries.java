import java.util.Scanner;

public class FibonacciSeries {

    public static int Fib(int input){
       if (input == 0){
           return 0;
       } else if (input == 1){
           return 1;
       } else return Fib(input-1) + Fib(input-2);
    }

//    public static int FibD(int input){
//        if (input == 0){
//            return 0;
//        } else if (input ==1) {
//            return 1;
//        } else {
//            int result = 0;
//            for (int i=2; i<input; i++){
//            }
//
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number: ");
        System.out.println(Fib(sc.nextInt()));
    }
}
