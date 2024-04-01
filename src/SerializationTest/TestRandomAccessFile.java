package SerializationTest;

import java.io.RandomAccessFile;

public class TestRandomAccessFile {
    public static void main(String[] args) throws Exception{
        RandomAccessFile randomAccessFile = new RandomAccessFile("raf.txt", "rw" );
        randomAccessFile.writeChars("Test");
        randomAccessFile.seek(0);
        String s = randomAccessFile.readLine();
        System.out.println(s);
        randomAccessFile.close();
    }
}
