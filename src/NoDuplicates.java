import java.util.Arrays;

public class NoDuplicates {


    public static void main(String[] args) {
        int[] example = {2,2,3,4,1,1,9,5,6,6};
        System.out.println(Arrays.toString(removeDups(example)));
    }

    public static int[] removeDups(int[] intArray) {
        int length = intArray.length;
        Arrays.sort(intArray);
        int rIndex = 1;
        for (int i=1; i<length; i++){
            if (intArray[i] != intArray[i-1]){
                intArray[rIndex] = intArray[i];
                rIndex++;
            }
        }
        int[] result = new int[rIndex];
        for (int i=0; i<rIndex; i++){
            result[i] = intArray[i];
        }
        return result;
    }

}
