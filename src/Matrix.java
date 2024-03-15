import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        int[][] matrix1 = new int[3][3];
        System.out.println("Enter data for matrix1:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = sc.nextInt();
            }

        }

        int[][] matrix2 = new int[3][3];
        System.out.println("Enter data for matrix2:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = sc.nextInt();
            }

        }


        int[][] matrix3 = new int[3][3];
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3.length; j++) {
                matrix3[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j] + matrix1[i][2] * matrix2[2][j];

            }
        }

        System.out.println("Display the Matrix3:");
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.println(matrix3[i][j] + "\t");
            }
            System.out.println();


        }


    }
}
