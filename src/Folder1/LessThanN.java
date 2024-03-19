package Folder1;

public class LessThanN {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        for (int i=0; i<=n; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

    }
}
