import java.util.Arrays;
import java.util.LinkedList;

public class KthMaxMin {
    public static void main(String[] args) {
        int[] test = {3,2,46,34,12};
        //sorted = {2,3,12,34,46};
        System.out.println(findItMin(test, 2));
        System.out.println(findItMax(test, 3));

    }
    public static int findItMin (int[] intArray, int position){
        if (intArray == null){
            System.out.println("Array is empty");
            return -1;
        }
        int result = 0;
        Arrays.sort(intArray);
        return intArray[position-1];
    }

    public static int findItMax (int[] intArray, int position){
        if (intArray == null){
            System.out.println("Array is empty");
            return -1;
        }
        int result = 0;
        Arrays.sort(intArray);
        int[] update = new int[intArray.length];
        int l = update.length;
        int index = 0;
        for (int i=l-1; i>-1; i--){
            update[index] = intArray[i];
            index++;
        }
        return update[position-1];
    }


}
