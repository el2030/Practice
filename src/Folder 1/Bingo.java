import java.util.Arrays;
import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        int[] BingoCard = new int[5];
        Random random = new Random();
        boolean Bingo = false;
        for (int i=0; i<5; i++){
            BingoCard[i] = random.nextInt(50);
        }
        if (Integer.parseInt(args[0]) > 50 || args.length != 1){
            System.out.println("Please enter a number between 1 and 50");
        } else {
            int input = Integer.parseInt(args[0]);
            for (int i = 0; i < 5; i++) {
                if (BingoCard[i] == input) {
                    System.out.println("BINGO");
                    Bingo = true;
                    break;
                }
            }
        if (!Bingo) {
            System.out.println("Better luck next time");
        }
        }
    }
}
