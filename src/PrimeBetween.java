import java.util.Scanner;

public class PrimeBetween {

    public static void checkPrime(int input){
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
        Scanner sc = new Scanner(System.in);
        int input1;
        int input2;
        System.out.println("Please input first number");
        input1 = sc.nextInt();
        System.out.println("Please input second number");
        sc.nextLine();
        input2 = sc.nextInt();
        for (int i=input1+1; i<input2; i++){
            checkPrime(i);
        }
    }
}
