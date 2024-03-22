package ExceptionHandling;

import java.util.Scanner;

public class HandleArray {
    public static void main(String[] args){
        int[] intArray = {0,1,2,3,4,5,6,7,8,9};
        int result = 0;
        System.out.println("Please input a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>9){
            try {
                throw new Exception("Num cannot be bigger than 9");
            } catch (Exception e){
                e.printStackTrace();
            }

        } else {
            result = intArray[num];
            System.out.println("Array " + num + " is " + result);
        }
        System.out.println("Array 5 is " + intArray[5]);
    }
}
