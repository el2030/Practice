package IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestFileOutputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fos = null;
//        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter input here");
//            String s = sc.nextLine();
//            fos.write(s.getBytes());
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (fos!=null) fos.close();
//        }

        try {
            fos = new FileInputStream("abc.txt");
            int a = 0;
            byte[] b = new byte[10];
            //can try skip() and mark();
            fos.read(b);
            a=fos.read(b,2,6);
            System.out.println((char)a);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
