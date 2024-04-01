import java.util.Arrays;

public class FindDups {

    public static void main(String[] args) {
        int[] test = {3,4,5,6,7,2,1,2,0};
        System.out.println(findIt(test));
    }
    public static int findIt(int[] inputArray){
        Arrays.sort(inputArray);
        int l = inputArray.length;
        int result = 0;
        for (int i=0; i<l-1; i++){
            if (inputArray[i] == inputArray[i+1]){
                result = inputArray[i];
                return result;
            }
        }
        System.out.println("Array does NOT contain duplicates");
        return -1;
    }
}
