public class PrimeNumber {

    public static int primeCheck(int num){

        for (int i=2; i<num; i++){
            if (num%i == 0){
                System.out.println(num + " is NOT PRIME number");
                return -1;
            }
            else continue;
        }
        System.out.println(num + " is a PRIME number");
        return -1;
    }

    public static void main(String[] args) {
        primeCheck(37);
    }
}
