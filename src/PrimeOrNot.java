import java.util.Scanner;

public class PrimeOrNot {

    public static void checkPrime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input an integer to check for prime");
        int input = sc.nextInt();
        for (int i=2; i<input; i++){
            if (input%i == 0){
                System.out.println(input + " is NOT PRIME number");
                return;
            }
            else continue;
        }
        System.out.println(input + " is a PRIME number");
        return;
    }
    public static void main(String[] args) {
        checkPrime();
    }
}
