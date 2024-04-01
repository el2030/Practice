package IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
      for (int i=0; i<5; i++){
            System.out.println("Please enter strings for line " + i);
            output.append(sc.nextLine());
            output.append('\n');
        }
        try {
            FileOutputStream fos = new FileOutputStream("FileWriteOutput.txt");
            fos.write(output.toString().getBytes());
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fis = new FileInputStream("FileWriteOutput.txt");
            int contentL;
            StringBuilder content = new StringBuilder();
            while ( (contentL=fis.read()) != -1){
                content.append((char)contentL);
            }
            System.out.println(content.toString());
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
