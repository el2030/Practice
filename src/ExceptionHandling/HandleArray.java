package ExceptionHandling;

public class HandleArray {
    public static void main(String[] args) {
        int[] intArray = {0,1,2,3,4,5,6,7,8,9};
        int eleven = 0;
        try{
            eleven = intArray[10];
            System.out.println("Array 11 is: " + intArray[10]);
        } catch (ArrayIndexOutOfBoundsException a){
            a.printStackTrace();
        }
        System.out.println("Array 5 is: " + intArray[5]);
    }
}
