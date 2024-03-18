import java.util.Arrays;

public class NoDuplicates {


    public static void main(String[] args) {
        int[] example = {2,2,3,4,1,1,9,5,6,6};
        int[] result = removeDups(example);
        System.out.println(Arrays.toString(result));
    }

    public static int[] removeDups(int[] intArray) {
        int length = intArray.length;
        Arrays.sort(intArray);
        int[] result = new int[length];
        result[0] = intArray[0];
        int rIndex = 0;
        for (int i=1; i<length; i++){
            if (result[rIndex] != intArray[i]){
                result[rIndex+1] = intArray[i];
                rIndex++;
            }
        }
        return result;
    }

}
