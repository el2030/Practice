import java.util.Arrays;

public class UnionInter {
    public static void main(String[] args) {
        int[] input1 = {1,2,3,4};
        int[] input2 = {3,4,5,6,7};
        justDoIt(input1, input2);
    }
    public static void justDoIt(int[] input1, int[] input2){
        int l1 = input1.length;
        int l2 = input2.length;
        int l3 = l1+l2;
        int[] intersection = new int[Math.min(l1,l2)];
        int[] union = new int[l3];
        Arrays.sort(input1);
        Arrays.sort(input2);
//        int index = 0;
//        if (l1 < l2){
//            for (int i=0; i<l2; i++){
//                if (input1[index] == input2[i]){
//                    intersection[index] = input1[index];
//                    System.out.println(input1[index]);
//                    index++;
//
//                }
//            }
//        }
        System.out.println(Arrays.toString(intersection));

    }
}
