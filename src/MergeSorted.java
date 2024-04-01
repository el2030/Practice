import java.util.Arrays;

public class MergeSorted{
    public static void main(String[] args) {
        int[] i1 = {2,3,4,5,6};
        int[] i2 = {10,12,14};
        System.out.println(Arrays.toString(mergeIt(i1,i2)));
    }

    public static int[] mergeIt(int[] input1, int[] input2){
        if (input1 == null) return input2;
        else if (input2 == null) return input1;
        else{
            int l1 = input1.length;
            int l2 = input2.length;
            int l3 = l1 + l2;

            int[] result =  new int[l1+l2];
            for (int i=0; i<l1; i++){
                result[i] = input1[i];
            }
            for (int i=0; i<l2; i++){
                result[l1+i] = input2[i];
            }
            Arrays.sort(result);
            return result;
        }
    }
}
