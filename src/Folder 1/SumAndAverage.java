import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] intArray = new int[99];
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        String s = "";
        do {
            System.out.println("Please enter an integer, press x to exit");
            s = sc.nextLine();
            if (s.equals("x") || s.isEmpty()){
                break;
            }
            int i = Integer.parseInt(s);
            intArray[counter] = i;
            counter++;
        } while (true);
        sc.close();
        int sum = 0;
        for (int i: intArray){
            sum+=i;
        }

        System.out.println("Sum =: " + sum);
        System.out.println("Average =: " + (float) sum/counter);


    }
}
