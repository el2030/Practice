import java.util.Arrays;

public class TwoNumberSwab {
    public static void main(String[] args) {

        int[] test = {1,2};
        Swap(test);
        System.out.println(Arrays.toString(test));

    }
    public static void Swap(int[] intArray){
        int temp = intArray[0];
        intArray[0] = intArray[1];
        intArray[1] = temp;
    }
}
