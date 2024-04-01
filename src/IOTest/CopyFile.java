package IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String source ="";
        String dest = "";
        StringBuilder content = new StringBuilder();
        System.out.println("Please enter source file name:");
        source = sc.nextLine();
        System.out.println("Please enter destination file name");
        dest = sc.nextLine();
        try {
            FileInputStream fis = new FileInputStream(source + ".txt");
            int value;
            while ((value=fis.read())!=-1 ){
                content.append((char) value);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileOutputStream fos = new FileOutputStream(dest + ".txt");
            fos.write(content.toString().getBytes());
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
