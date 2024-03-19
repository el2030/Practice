package Folder3;

public class PrimeFactor {
    public static void main(String[] args) {
        System.out.println(factor(45));

    }
    public static int factor(int num){
        int result = 0;
        int[] primeNums = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int l = primeNums.length;
        for (int i=0; i<l; i++){
            if (num%primeNums[i] ==0){
                result = primeNums[i];
            }
        }
        return result;
    }
}
